/**  
* <p>Title: IStudentDao.java</p>  
* <p>Description: </p>   
* @author kklibai  
* @date 2018年12月15日   
*/  
package libai.stu_man.dao;

import java.sql.SQLException;
import java.util.List;

import libai.stu_man.entity.Admin;
import libai.stu_man.entity.Student;


public interface IDao {
	int PAGE_SIZE = 10;
	
	/**
	 * 管理员登录
	 * @param admin 管理员的封装类
	 * @return 
	 */
	boolean login(Admin admin)throws SQLException;
	/**
	 * 查询student表中的所有数据
	 * @param table 指定的表名
	 * @return 
	 */
	List<Student> queryAllStu ()throws SQLException;
	/**
	 * 添加一个指定的学生
	 * @param student 指定的学生
	 * @return 成功返回true，失败返回false
	 */
	boolean addStu(Student student)throws SQLException;
	/**
	 * 查询一个指定的学生是否存在
	 * @param student 指定的学生
	 * @return 存在返回true，不存在返回false
	 */
	boolean isExist(int stuNo)throws SQLException;
	/**
	 * 删除一个指定的学生
	 * @param stuNo 指定的学生的学号
	 * @return 删除成功返回true，失败返回false
	 */
	boolean delStu(int stuNo)throws SQLException;
	/**
	 * 查询一个指定的学生信息
	 * @param stuNo 指定的学生的学号
	 * @return 查询到的学生的信息的封装实体对象
	 * @throws SQLException
	 */
	Student queryStuById(int stuNo) throws SQLException;
	/**
	 * 
	 * @param student 
	 * @return 
	 * @throws SQLException
	 */
	/**
	 * 更新一名学生的信息
	 * @param student 封装了新的学生信息的对象
	 * @return 成功返回true，失败返回false
	 * @throws SQLException
	 */
	boolean updateStu(Student student) throws SQLException;
	/**
	 * 根据给定的name和性别查询学生
	 * @param sName
	 * @param sSex
	 * @return 
	 * @throws SQLException
	 */
	List<Student> queryStu(String sName,String sSex)throws SQLException;
	/**
	 * 根据给定的页面数查询当页的所有数据集合
	 * @param currentPage
	 * @return
	 * @throws SQLException
	 */
	List<Student> queryStuByPage(int currentPage) throws SQLException;
	/**
	 * 查询总数据有多少条
	 * @return
	 * @throws SQLException
	 */
	int totalSize() throws SQLException;
}
