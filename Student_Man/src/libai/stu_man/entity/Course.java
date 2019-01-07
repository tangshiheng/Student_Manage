package libai.stu_man.entity;

public class Course {
	private int courseNo;//课程号
	private String courseName;//课程名
	private int courseItem;//开学学期
	private int coursePeriod;//学时
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
	private int courseCredit;//学分
	
}
