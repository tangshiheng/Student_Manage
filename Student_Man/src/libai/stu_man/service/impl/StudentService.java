/**  
* <p>Title: StudentService.java</p>  
* <p>Description: </p>   
* @author kklibai  
* @date 2018Äê12ÔÂ15ÈÕ   
*/  
package libai.stu_man.service.impl;


import java.sql.SQLException;
import java.util.List;

import libai.stu_man.dao.IDao;
import libai.stu_man.dao.impl.StudentDao;
import libai.stu_man.entity.Admin;
import libai.stu_man.entity.PageBean;
import libai.stu_man.entity.Student;
import libai.stu_man.service.IStudentService;


public class StudentService implements IStudentService {
	IDao dao = new StudentDao();

	@Override
	public boolean login(Admin admin) {
		try {
			return dao.login(admin);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Student> queryAllStu() {
		try {
			return dao.queryAllStu();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addStu(Student student) {
		try {
			if(!dao.isExist(student.getStuNo())){
				return dao.addStu(student);
			}else{
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delStu(int stuNo) {
		try {
			if(dao.isExist(stuNo)) return dao.delStu(stuNo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateStu(Student student) {
		try {
			return dao.updateStu(student);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Student findStuById(int stuNo) {
		try {
			return dao.queryStuById(stuNo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Student> queryStu(String sName, String sSex) {
		try {
			return dao.queryStu(sName, sSex);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	@Override
	public PageBean<Student> queryStuByPage(int currentPage) {
		PageBean<Student> pageBean = new PageBean<>();
		int pageSize = IDao.PAGE_SIZE;
		int totalSize =0;
		try {
			totalSize= dao.totalSize();
			pageBean.setCurrentPage(currentPage);
			pageBean.setList(dao.queryStuByPage(currentPage));
			pageBean.setPageSize(pageSize);
			pageBean.setTotalSize(totalSize);
			pageBean.setTotalPage(totalSize % pageSize == 0 ? (totalSize / pageSize) : (totalSize / pageSize + 1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pageBean;
	}

	
}
