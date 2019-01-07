/**  
* <p>Title: IStudentService.java</p>  
* <p>Description: </p>   
* @author kklibai  
* @date 2018年12月15日   
*/  
package libai.stu_man.service;
import java.util.List;

import libai.stu_man.entity.Admin;
import libai.stu_man.entity.PageBean;
import libai.stu_man.entity.Student;

public interface IStudentService {
	/**
	 * 处理servlet传过来的数据，使用dao层的login()方法
	 * @param admin
	 * @return true为登录成功，false为失败
	 */
	boolean login(Admin admin);
	/**
	 * 查询所有的学生信息
	 * @param table 表名为student
	 * @return 返回所有的学生信息集合
	 */
	List<Student> queryAllStu();
	/**
	 * 添加一个指定的学生的学生信息到数据库中
	 * @param student 指定的学生
	 * @return 成功返回true，失败返回false
	 */
	boolean addStu(Student student);
	/**
	 * 删除一个指定的学生
	 * @param stuNo 指定的学生的学号
	 * @return 成功返回true，失败返回false
	 */
	boolean delStu(int stuNo);
	/**
	 * 更新一名学生的信息
	 * @param student 封装了新的信息的学生对象
	 * @return 成功返回true，失败返回false
	 */
	boolean updateStu(Student student);
	/**
	 * 根据学号查询一名学生的信息
	 * @param stuNo
	 * @return 一个封装了指定学生信息的对象
	 */
	 Student findStuById(int stuNo);
		/**
		 * 根据给定的name和性别查询学生
		 * @param sName
		 * @param sSex
		 * @return 
		 */
	List<Student> queryStu(String sName,String sSex);
	/**
	 * 传入一个页码，将指定页码的页面的所有数据封装成一个对象
	 * @param currentPage
	 * @return
	 */
	PageBean<Student> queryStuByPage(int currentPage);
}
