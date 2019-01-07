/**  
* <p>Title: StudentDao.java</p>  
* <p>Description: </p>   
* @author kklibai  
* @date 2018年12月15日   
*/  
package libai.stu_man.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.sql.DataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import libai.stu_man.dao.IDao;
import libai.stu_man.entity.Admin;
import libai.stu_man.entity.Student;
import libai.stu_man.util.JdbcUtil;
import libai.stu_man.util.TextUtil;

public class StudentDao implements IDao {
	DataSource dataSource = new ComboPooledDataSource();
	//QueryRunner类只负责增删改查，不负责连接
	QueryRunner run = new QueryRunner(dataSource);
	@Override
	public boolean login(Admin admin) throws SQLException {
		Connection conn = dataSource.getConnection();
		PreparedStatement pst = conn.prepareStatement("select * from admin_table where admin_name=? and admin_password=?");
		pst.setString(1, admin.getAdmin_name());
		pst.setString(2, admin.getAdmin_password());
		ResultSet rs = pst.executeQuery();
		if(rs.next()) return true;
		JdbcUtil.release(rs, pst, conn);
		return false;
	}

	@Override
	public List<Student> queryAllStu() throws SQLException {
		List<Student> list = run.query("select * from student",
				new BeanListHandler<Student>(Student.class));
		return list;
	}

	@Override
	public boolean addStu(Student student) throws SQLException {
		Date birthday = student.getStuBirthday();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String str = format.format(birthday);
		java.sql.Date date2 = java.sql.Date.valueOf(str);
		int num = run.update("insert into student values(?,?,?,?,?,?,?)", 
				student.getStuNo(),
				student.getStuName(),
				student.getStuSex(),
				date2,
				student.getStuMajor(),
				student.getStuTotalCredit(),
				student.getStuRemark());
		if(num != 0) return true;
		return false;
	}

	@Override
	public boolean isExist(int stuNo) throws SQLException{
		Student stu = run.query("select * from student where stuNo = ?",
				new BeanHandler<Student>(Student.class),
				stuNo);
		if(stu != null) return true;
		return false;
	}

	@Override
	public boolean delStu(int stuNo) throws SQLException {
		int num = run.update("delete from student where stuNo=?",stuNo);
		if(num != 0) return true;
		return false;
	}

	@Override
	public Student queryStuById(int stuNo) throws SQLException {
		Student student = run.query("select * from student where stuNo=?", new BeanHandler<Student>(Student.class),stuNo);
		return student;
	}

	@Override
	public boolean updateStu(Student student) throws SQLException {
		int num = run.update("UPDATE student SET stuName=?,stuSex=?,stuBirthday=?,stuMajor=?,stuTotalCredit=?,stuRemark=? WHERE stuNo = ?",
				student.getStuName(),
				student.getStuSex(),
				student.getStuBirthday(),
				student.getStuMajor(),
				student.getStuTotalCredit(),
				student.getStuRemark(),
				student.getStuNo());
		if(num != 0) return true;
		return false;
	}

	@Override
	public List<Student> queryStu(String sName, String sSex) throws SQLException {
		String sql = "select * from student where 1=1 ";
		List<String> list = new ArrayList<>();
		if(!TextUtil.isEmpty(sName)){
			System.out.println("sName的值为"+sName);
			sql = sql + "and stuName like ?";
			list.add("%"+sName+"%");
		}
		if(!TextUtil.isEmpty(sSex)){
			System.out.println("sSex的值为"+sSex);
			sql = sql + "and stuSex=?";
			list.add(sSex);
		}
		return run.query(sql,new BeanListHandler<Student>(Student.class),list.toArray());
		
	}

	
	@Override
	public List<Student> queryStuByPage(int currentPage) throws SQLException {
		List<Student> list = run.query("select * from student limit ? offset ?", new BeanListHandler<Student>(Student.class),
				PAGE_SIZE,PAGE_SIZE*(currentPage-1));
		return list;
	}

	@Override
	public int totalSize() throws SQLException {
		Long size = (Long)run.query("select count(*) from student",new ScalarHandler());
		return size.intValue();
	}
	

}
