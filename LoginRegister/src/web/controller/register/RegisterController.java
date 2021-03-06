package web.controller.register;

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
import web.service.RegisterService;

@WebServlet("/register")
public class RegisterController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		WebMoveController.move(request, response, "./WEB-INF/view/register/register.jsp"); // register 페이지로 이동
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String confirm_password = request.getParameter("confirm_password");
		
		try {
			// 비밀번호가 동일한지 확인
			if(password.equals(confirm_password)) 
			{
				Member member = new Member(id, password);
				if(RegisterService.Register(member)) 
				{
					System.out.println("success the register");
					WebMoveController.move(request, response, "./WEB-INF/view/index/index.jsp");
				}
			}
			// fail register
			WebMoveController.move(request, response, "./WEB-INF/view/register/register.jsp");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
				
	}
	
	

}
