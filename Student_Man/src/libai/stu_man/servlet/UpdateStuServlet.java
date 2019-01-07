package libai.stu_man.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import libai.stu_man.entity.Student;
import libai.stu_man.service.IStudentService;
import libai.stu_man.service.impl.StudentService;

/**
 * Servlet implementation class UpdateStuServlet
 */
public class UpdateStuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		IStudentService service = new StudentService();
		Student student = new Student();
		student.setStuNo(Integer.parseInt(request.getParameter("stuNo")));;
		student.setStuName(request.getParameter("stuName"));
		student.setStuSex(request.getParameter("stuSex"));
		
		String date = request.getParameter("stuBirthday");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = null;
		try {
			birthday = format.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		student.setStuBirthday(birthday);
		
		student.setStuTotalCredit(Integer.parseInt(request.getParameter("stuTotalCredit")));
		student.setStuMajor(request.getParameter("stuMajor"));
		student.setStuRemark(request.getParameter("stuRemark"));
		boolean flag = service.updateStu(student);

		if(flag)
		response.sendRedirect("StuList");
		else System.out.println(flag);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
