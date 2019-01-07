/**  
* <p>Title: IStudentDao.java</p>  
* <p>Description: </p>   
* @author kklibai  
* @date 2018��12��15��   
*/  
package libai.stu_man.dao;

import java.sql.SQLException;
import java.util.List;

import libai.stu_man.entity.Admin;
import libai.stu_man.entity.Student;


public interface IDao {
	int PAGE_SIZE = 10;
	
	/**
	 * ����Ա��¼
	 * @param admin ����Ա�ķ�װ��
	 * @return 
	 */
	boolean login(Admin admin)throws SQLException;
	/**
	 * ��ѯstudent���е���������
	 * @param table ָ���ı���
	 * @return 
	 */
	List<Student> queryAllStu ()throws SQLException;
	/**
	 * ���һ��ָ����ѧ��
	 * @param student ָ����ѧ��
	 * @return �ɹ�����true��ʧ�ܷ���false
	 */
	boolean addStu(Student student)throws SQLException;
	/**
	 * ��ѯһ��ָ����ѧ���Ƿ����
	 * @param student ָ����ѧ��
	 * @return ���ڷ���true�������ڷ���false
	 */
	boolean isExist(int stuNo)throws SQLException;
	/**
	 * ɾ��һ��ָ����ѧ��
	 * @param stuNo ָ����ѧ����ѧ��
	 * @return ɾ���ɹ�����true��ʧ�ܷ���false
	 */
	boolean delStu(int stuNo)throws SQLException;
	/**
	 * ��ѯһ��ָ����ѧ����Ϣ
	 * @param stuNo ָ����ѧ����ѧ��
	 * @return ��ѯ����ѧ������Ϣ�ķ�װʵ�����
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
	 * ����һ��ѧ������Ϣ
	 * @param student ��װ���µ�ѧ����Ϣ�Ķ���
	 * @return �ɹ�����true��ʧ�ܷ���false
	 * @throws SQLException
	 */
	boolean updateStu(Student student) throws SQLException;
	/**
	 * ���ݸ�����name���Ա��ѯѧ��
	 * @param sName
	 * @param sSex
	 * @return 
	 * @throws SQLException
	 */
	List<Student> queryStu(String sName,String sSex)throws SQLException;
	/**
	 * ���ݸ�����ҳ������ѯ��ҳ���������ݼ���
	 * @param currentPage
	 * @return
	 * @throws SQLException
	 */
	List<Student> queryStuByPage(int currentPage) throws SQLException;
	/**
	 * ��ѯ�������ж�����
	 * @return
	 * @throws SQLException
	 */
	int totalSize() throws SQLException;
}
