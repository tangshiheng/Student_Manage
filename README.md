# Student_Manage
# B/S架构的学生管理系统
一、	设计模式<br>
三层架构模式<br>
二、	数据库的创建<br>
学生信息表、课程信息表、成绩表<br>
三、	使用技术<br>
前端：html、css、js、jquery框架、bootstrap框架、jsp页面<br>
后端：java语言、servlet处理<br>
数据库：oracle<br>
四、	功能<br>
达到对学生信息的添加，修改，删除，查询，分页显示信息<br>
五、	具体实现<br>
表示层：html+css+bootstrap<br>
index.html:管理员的登录界面 action到loginServlet.java<br>
		addStu.jsp:添加学生信息的页面<br>
		option.html:选择分页查询或者显示全部信息（未用）<br>
		stuByPage.jsp:分页显示全部信息<br>
		stuList.jsp:单页显示全部信息<br>
		updateStu.jsp:修改学生信息的页面<br>
		Servlet:<br>
addStuServlet:添加一个学生的信息<br>
DeleteStuServlet:删除一个学生的信息<br>
LoginServlet:登录<br>
PageListServlet:分页显示全部学生信息<br>
QueryByOptionServlet:根据给定的信息查询学生信息<br>
StuListServlet:单页显示全部学生信息<br>
UpdateServlet:接收传入的学生信息，封装成一个学生对象oldStu，然后传给updateStu.jsp<br>
UpdateStuServlet:接收updateStu.jsp传来的学生信息，封装成一个新的学生对象<br>
业务逻辑层：<br>
		/**<br>
	 * 处理servlet传过来的数据，使用dao层的login()方法<br>
	 * @param admin<br>
	 * @return true为登录成功，false为失败<br>
	 */<br>
	boolean login(Admin admin);<br>
	/**<br>
	 * 查询所有的学生信息<br>
	 * @param table 表名为student<br>
	 * @return 返回所有的学生信息集合<br>
	 */<br>
	List<Student> queryAllStu();<br>
	/**<br>
	 * 添加一个指定的学生的学生信息到数据库中<br>
	 * @param student 指定的学生<br>
	 * @return 成功返回true，失败返回false<br>
	 */<br>
	boolean addStu(Student student);<br>
	/**<br>
	 * 删除一个指定的学生<br>
	 * @param stuNo 指定的学生的学号<br>
	 * @return 成功返回true，失败返回false<br>
	 */<br>
	boolean delStu(int stuNo);<br>
	/**<br>
	 * 更新一名学生的信息<br>
	 * @param student 封装了新的信息的学生对象<br>
	 * @return 成功返回true，失败返回false<br>
	 */<br>
	boolean updateStu(Student student);<br>
	/**<br>
	 * 根据学号查询一名学生的信息<br>
	 * @param stuNo<br>
	 * @return 一个封装了指定学生信息的对象<br>
	 */<br>
	 Student findStuById(int stuNo);<br>
		/**<br>
		 * 根据给定的name和性别查询学生<br>
		 * @param sName<br>
		 * @param sSex<br>
		 * @return <br>
		 */<br>
	List<Student> queryStu(String sName,String sSex);<br>
	/**<br>
	 * 传入一个页码，将指定页码的页面的所有数据封装成一个对象<br>
	 * @param currentPage<br>
	 * @return<br>
	 */<br>
	PageBean<Student> queryStuByPage(int currentPage);<br>
数据访问层：<br>
	/**<br>
	 * 管理员登录<br>
	 * @param admin 管理员的封装类<br>
	 * @return <br>
	 */<br>
	boolean login(Admin admin)throws SQLException;<br>
	/**<br>
	 * 查询student表中的所有数据<br>
	 * @param table 指定的表名<br>
	 * @return <br>
	 */<br>
	List<Student> queryAllStu ()throws SQLException;<br>
	/**<br>
	 * 添加一个指定的学生<br>
	 * @param student 指定的学生<br>
	 * @return 成功返回true，失败返回false<br>
	 */<br>
	boolean addStu(Student student)throws SQLException;<br>
	/**<br>
	 * 查询一个指定的学生是否存在<br>
	 * @param student 指定的学生<br>
	 * @return 存在返回true，不存在返回false<br>
	 */<br>
	boolean isExist(int stuNo)throws SQLException;<br>
	/**<br>
	 * 删除一个指定的学生<br>
	 * @param stuNo 指定的学生的学号<br>
	 * @return 删除成功返回true，失败返回false<br>
	 */<br>
	boolean delStu(int stuNo)throws SQLException;<br>
	/**<br>
	 * 查询一个指定的学生信息<br>
	 * @param stuNo 指定的学生的学号<br>
	 * @return 查询到的学生的信息的封装实体对象<br>
	 * @throws SQLException<br>
	 */<br>
	Student queryStuById(int stuNo) throws SQLException;<br>
	/**<br>
	 * <br>
	 * @param student <br>
	 * @return <br>
	 * @throws SQLException<br>
	 */<br>
	/**<br>
	 * 更新一名学生的信息<br>
	 * @param student 封装了新的学生信息的对象<br>
	 * @return 成功返回true，失败返回false<br>
	 * @throws SQLException<br>
	 */<br>
	boolean updateStu(Student student) throws SQLException;<br>
	/**<br>
	 * 根据给定的name和性别查询学生<br>
	 * @param sName<br>
	 * @param sSex<br>
	 * @return <br>
	 * @throws SQLException<br>
	 */<br>
	List<Student> queryStu(String sName,String sSex)throws SQLException;<br>
	/**<br>
	 * 根据给定的页面数查询当页的所有数据集合<br>
	 * @param currentPage<br>
	 * @return<br>
	 * @throws SQLException<br>
	 */<br>
	List<Student> queryStuByPage(int currentPage) throws SQLException;<br>
	/**<br>
	 * 查询总数居有多少条<br>
	 * @return<br>
	 * @throws SQLException<br>
	 */<br>
	int totalSize() throws SQLException;<br>
工具类：<br>
JdbcUtil：封装了JDBC常用的方法<br>
TextUtil:就一个方法，判断传入的字符串是否为空<br>
实体类：<br>
Student<br>
private int no;<br>
private String name;<br>
private String sex;<br>
private Date birthday;<br>
private String major;//专业<br>
private int totalCredit;//总学分<br>
private String remark;//备注<br>
private file picture;//照片<br>
	Course：<br>
	private int courseNo;//课程号<br>
	private String courseName;//课程名<br>
	private int courseItem;//开学学期<br>
	private int coursePeriod;//学时<br>
	Score：<br>
		private int stu_no;//学号<br>
	private int cou_no;//课程号<br>
	private int grade;//成绩<br>
Admin<br>
private String admin_name;<br>
		private String admin_password<br>
PageBean：<br>
	//当前页面数currentPage<br>
	private int currentPage;<br>
	//总页面数totalPage<br>
	private int totalPage;<br>
	//每页的记录数pageSize<br>
	private int pageSize;<br>
	//总记录数totalSize<br>
	private int totalSize;<br>
	//存放当前页面的数据的集合<br>
	private List<T> list;<br><br>

