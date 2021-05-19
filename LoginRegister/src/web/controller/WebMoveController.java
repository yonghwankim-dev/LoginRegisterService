package web.controller;

import java.io.IOException;
import java.net.http.HttpRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WebMoveController extends HttpServlet{
	public static void move(HttpServletRequest request, HttpServletResponse response, String path) throws ServletException, IOException
	{
		request.getRequestDispatcher(path)
				.forward(request, response);
	}
}
