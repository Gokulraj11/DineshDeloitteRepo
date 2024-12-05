package com.deloitte.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/squareroot")
public class SquareRootServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		//using URl rewritting
		//int value = Integer.parseInt(request.getParameter("sum"));

		//Using HTTP session
		//HttpSession session = request.getSession();
		//int value =  (int) session.getAttribute("sum");

		//Using cookie 
		//int value = 0;
		//Cookie[] cookie = request.getCookies();
		//for(Cookie c : cookie) {
		//	if(c.getName().equals("sum")) {
		//		value = Integer.parseInt(c.getValue());
		//	}
		//}
		
		//Using Hidden Form Fields
		int value = Integer.parseInt(request.getParameter("number"));
		PrintWriter out = response.getWriter();
		out.println("<title> OUTPUT </title>");
		out.println("The SQUARE Value of "+value+" = "+(value*value));
	}

}
