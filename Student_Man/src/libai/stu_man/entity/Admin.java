package libai.stu_man.entity;

public class Admin {
	private String admin_name;//����Ա����
	private String admin_password;//����Ա����
	public Admin() {
	}
	public Admin(String admin_name, String admin_password) {
		super();
		this.admin_name = admin_name;
		this.admin_password = admin_password;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

}
