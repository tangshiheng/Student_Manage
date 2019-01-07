/**  
* <p>Title: IStudentService.java</p>  
* <p>Description: </p>   
* @author kklibai  
* @date 2018��12��15��   
*/  
package libai.stu_man.service;
import java.util.List;

import libai.stu_man.entity.Admin;
import libai.stu_man.entity.PageBean;
import libai.stu_man.entity.Student;

public interface IStudentService {
	/**
	 * ����servlet�����������ݣ�ʹ��dao���login()����
	 * @param admin
	 * @return trueΪ��¼�ɹ���falseΪʧ��
	 */
	boolean login(Admin admin);
	/**
	 * ��ѯ���е�ѧ����Ϣ
	 * @param table ����Ϊstudent
	 * @return �������е�ѧ����Ϣ����
	 */
	List<Student> queryAllStu();
	/**
	 * ���һ��ָ����ѧ����ѧ����Ϣ�����ݿ���
	 * @param student ָ����ѧ��
	 * @return �ɹ�����true��ʧ�ܷ���false
	 */
	boolean addStu(Student student);
	/**
	 * ɾ��һ��ָ����ѧ��
	 * @param stuNo ָ����ѧ����ѧ��
	 * @return �ɹ�����true��ʧ�ܷ���false
	 */
	boolean delStu(int stuNo);
	/**
	 * ����һ��ѧ������Ϣ
	 * @param student ��װ���µ���Ϣ��ѧ������
	 * @return �ɹ�����true��ʧ�ܷ���false
	 */
	boolean updateStu(Student student);
	/**
	 * ����ѧ�Ų�ѯһ��ѧ������Ϣ
	 * @param stuNo
	 * @return һ����װ��ָ��ѧ����Ϣ�Ķ���
	 */
	 Student findStuById(int stuNo);
		/**
		 * ���ݸ�����name���Ա��ѯѧ��
		 * @param sName
		 * @param sSex
		 * @return 
		 */
	List<Student> queryStu(String sName,String sSex);
	/**
	 * ����һ��ҳ�룬��ָ��ҳ���ҳ����������ݷ�װ��һ������
	 * @param currentPage
	 * @return
	 */
	PageBean<Student> queryStuByPage(int currentPage);
}
