package libai.stu_man.entity;

public class Score {
	private int stu_no;//Ñ§ºÅ
	private int cou_no;//¿Î³ÌºÅ
	private int grade;//³É¼¨
	public int getStu_no() {
		return stu_no;
	}
	public void setStu_no(int stu_no) {
		this.stu_no = stu_no;
	}
	public int getCou_no() {
		return cou_no;
	}
	public void setCou_no(int cou_no) {
		this.cou_no = cou_no;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Score(int stu_no, int cou_no, int grade) {
		super();
		this.stu_no = stu_no;
		this.cou_no = cou_no;
		this.grade = grade;
	}
	
}
