package web.controller.login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.controller.WebMoveController;
import web.entity.Member;
import web.service.LoginService;

@WebServlet("/login")
public class LoginController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		WebMoveController.move(request, response, "./WEB-INF/view/login/login.jsp"); // login 페이지로 이동
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		try {
			Member member = new Member(id, password);
			if(LoginService.Login(member))	// success login!
			{
				request.getSession().setAttribute("id", id);
				WebMoveController.move(request, response, "./WEB-INF/view/index/index.jsp");
			}
			else	// fail login!
			{
				WebMoveController.move(request, response, "./WEB-INF/view/login/login.jsp");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	

}
