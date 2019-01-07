package libai.stu_man.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import libai.stu_man.entity.Student;
import libai.stu_man.service.IStudentService;
import libai.stu_man.service.impl.StudentService;

/**
 * Servlet implementation class StuList
 */
public class StuListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			IStudentService service = new StudentService();
			List<Student> list = service.queryAllStu();
			 
			request.setAttribute("stuList", list);
			request.getRequestDispatcher("stuList.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
