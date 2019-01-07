package libai.stu_man.servlet;


import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import libai.stu_man.entity.Admin;
import libai.stu_man.service.IStudentService;
import libai.stu_man.service.impl.StudentService;


/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取首页表单提交上来的request域中的数据
		String admin_name = request.getParameter("admin_name");
		String admin_password = request.getParameter("admin_password");
		Admin admin = new Admin(admin_name, admin_password);
		IStudentService service = new StudentService();
		if(service.login(admin)){
			response.sendRedirect("PageList?currentPage=1");
		}else{
			response.getWriter().write("failed");
		}	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
