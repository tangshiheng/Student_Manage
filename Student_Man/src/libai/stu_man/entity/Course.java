package libai.stu_man.entity;

public class Course {
	private int courseNo;//�γ̺�
	private String courseName;//�γ���
	private int courseItem;//��ѧѧ��
	private int coursePeriod;//ѧʱ
	public int getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(int courseNo) {
		this.courseNo = courseNo;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseItem() {
		return courseItem;
	}
	public void setCourseItem(int courseItem) {
		this.courseItem = courseItem;
	}
	public int getCoursePeriod() {
		return coursePeriod;
	}
	public void setCoursePeriod(int coursePeriod) {
		this.coursePeriod = coursePeriod;
	}
	public int getCourseCredit() {
		return courseCredit;
	}
	public void setCourseCredit(int courseCredit) {
		this.courseCredit = courseCredit;
	}
	private int courseCredit;//ѧ��
	
}
