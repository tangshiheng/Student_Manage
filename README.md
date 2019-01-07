# Student_Manage
# B/S架构的学生管理系统
一、	设计模式
三层架构模式
二、	数据库的创建
学生信息表、课程信息表、成绩表
三、	使用技术
前端：html、css、js、jquery框架、bootstrap框架、jsp页面
后端：java语言、servlet处理
数据库：oracle
四、	功能
达到对学生信息的添加，修改，删除，查询，分页显示信息
五、	具体实现
表示层：html+css+bootstrap
index.html:管理员的登录界面 action到loginServlet.java
		addStu.jsp:添加学生信息的页面
		option.html:选择分页查询或者显示全部信息（未用）
		stuByPage.jsp:分页显示全部信息
		stuList.jsp:单页显示全部信息
		updateStu.jsp:修改学生信息的页面
		Servlet:
addStuServlet:添加一个学生的信息
DeleteStuServlet:删除一个学生的信息
LoginServlet:登录
PageListServlet:分页显示全部学生信息
QueryByOptionServlet:根据给定的信息查询学生信息
StuListServlet:单页显示全部学生信息
UpdateServlet:接收传入的学生信息，封装成一个学生对象oldStu，然后传给updateStu.jsp
UpdateStuServlet:接收updateStu.jsp传来的学生信息，封装成一个新的学生对象
业务逻辑层：
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
数据访问层：
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
	 * 查询总数居有多少条
	 * @return
	 * @throws SQLException
	 */
	int totalSize() throws SQLException;
工具类：
JdbcUtil：封装了JDBC常用的方法
TextUtil:就一个方法，判断传入的字符串是否为空
实体类：
Student
private int no;
private String name;
private String sex;
private Date birthday;
private String major;//专业
private int totalCredit;//总学分
private String remark;//备注
private file picture;//照片
	Course：
	private int courseNo;//课程号
	private String courseName;//课程名
	private int courseItem;//开学学期
	private int coursePeriod;//学时
	Score：
		private int stu_no;//学号
	private int cou_no;//课程号
	private int grade;//成绩
Admin
private String admin_name;
		private String admin_password
PageBean：
	//当前页面数currentPage
	private int currentPage;
	//总页面数totalPage
	private int totalPage;
	//每页的记录数pageSize
	private int pageSize;
	//总记录数totalSize
	private int totalSize;
	//存放当前页面的数据的集合
	private List<T> list;

