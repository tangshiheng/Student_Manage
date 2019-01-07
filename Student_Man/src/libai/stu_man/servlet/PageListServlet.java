package libai.stu_man.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import libai.stu_man.entity.PageBean;
import libai.stu_man.service.IStudentService;
import libai.stu_man.service.impl.StudentService;

/**
 * Servlet implementation class PageListServlet
 */
public class PageListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int currentPage = Integer.parseInt(request.getParameter("currentPage"));
		IStudentService service = new StudentService();
		PageBean pageBean = new PageBean();
		pageBean = service.queryStuByPage(currentPage);
		request.setAttribute("pageBean", pageBean);
		request.getRequestDispatcher("stuByPage.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
