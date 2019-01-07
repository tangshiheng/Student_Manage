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
 * Servlet implementation class QueryByOptionServlet
 */
public class QueryByOptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String sName =request.getParameter("sName");
		String sSex =request.getParameter("sSex");
		
		IStudentService service = new StudentService();
		List<Student> list =  service.queryStu(sName, sSex);
		if(list != null){
		for (Student student : list) {
			System.out.println(student.getStuNo());
		}
		}
		request.setAttribute("stuList", list);
		request.getRequestDispatcher("stuList.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
