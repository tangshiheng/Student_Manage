package libai.stu_man.entity;

import java.util.Date;

public class Student {
	private int stuNo;// ѧ��
	private String stuName;// ����
	private String stuSex;// �Ա�
	private Date stuBirthday;// ��������
	private String stuMajor;// רҵ
	private int stuTotalCredit;// ��ѧ��
	private String stuRemark;// ��ע
	// private File picture;//��Ƭ
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuSex() {
		return stuSex;
	}
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}
	public Date getStuBirthday() {
		return stuBirthday;
	}
	public void setStuBirthday(Date stuBirthday) {
		this.stuBirthday = stuBirthday;
	}
	public String getStuMajor() {
		return stuMajor;
	}
	public void setStuMajor(String stuMajor) {
		this.stuMajor = stuMajor;
	}
	public int getStuTotalCredit() {
		return stuTotalCredit;
	}
	public void setStuTotalCredit(int stuTotalCredit) {
		this.stuTotalCredit = stuTotalCredit;
	}
	public String getStuRemark() {
		return stuRemark;
	}
	public void setStuRemark(String stuRemark) {
		this.stuRemark = stuRemark;
	}

	
}
