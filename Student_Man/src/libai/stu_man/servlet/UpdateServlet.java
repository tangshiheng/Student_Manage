package libai.stu_man.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import libai.stu_man.entity.Student;
import libai.stu_man.service.IStudentService;
import libai.stu_man.service.impl.StudentService;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int stuNo = Integer.parseInt(request.getParameter("stuNo"));
		IStudentService service = new StudentService();
		Student oldStu= service.findStuById(stuNo);
		request.setAttribute("oldStu", oldStu);
		request.getRequestDispatcher("updateStu.jsp").forward(request, response);;
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
