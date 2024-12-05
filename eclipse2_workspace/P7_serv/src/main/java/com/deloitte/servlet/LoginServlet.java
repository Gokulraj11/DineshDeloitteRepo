package com.deloitte.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String username = request.getParameter("user");
	String password = request.getParameter("password");
	
	if(username.equals("dinesh") && password.equals("dinesh@123")) {
		//RequestDispatcher rd = request.getRequestDispatcher("welcome");
		//rd.forward(request, response);
		response.sendRedirect("welcome");	
	}
	else {
		PrintWriter out =response.getWriter();
		out.println("<p> Incorrect Credentials </p>");
		RequestDispatcher rd = request.getRequestDispatcher("/login.html");
		rd.include(request, response);	
	}
	}
}
