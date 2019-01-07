package libai.stu_man.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import libai.stu_man.service.IStudentService;
import libai.stu_man.service.impl.StudentService;
/**
 * 用于处理删除学生
 * @author kongz
 *
 */
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IStudentService service = new StudentService();
		int stuNo = Integer.parseInt(request.getParameter("stuNo"));
		service.delStu(stuNo);
		response.sendRedirect("StuListServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
