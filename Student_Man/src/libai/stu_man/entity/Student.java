package libai.stu_man.entity;

import java.util.Date;

public class Student {
	private int stuNo;// 学号
	private String stuName;// 姓名
	private String stuSex;// 性别
	private Date stuBirthday;// 出生日期
	private String stuMajor;// 专业
	private int stuTotalCredit;// 总学分
	private String stuRemark;// 备注
	// private File picture;//照片
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
