package com.deloitte.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/add")
public class AddingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num1 = Integer.parseInt(request.getParameter("number1"));
		int num2 = Integer.parseInt(request.getParameter("number2"));
		int num3 = num1+num2;
		
		//using URL rewritting
		//response.sendRedirect("squareroot?sum="+num3);
		//request.setAttribute("sum", num3);
		
		//Using HTTP sessions
		HttpSession session = request.getSession();
		HttpSession session1 = request.getSession(false);
		Date CreationTime = new Date(session.getCreationTime());
		Date lastAccessedTime = new Date(session.getLastAccessedTime());
		String sessionId1 = session.getId();
		session.invalidate();
		//session.setAttribute("sum", num3);
		//response.sendRedirect("squareroot");
		
		//Using Cookies
		//Cookie cooki = new Cookie("sum", String.valueOf(num3));
		//response.addCookie(cooki);
		//response.sendRedirect("squareroot");

		//Using Hidden Form Fields
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<title> Calculating </title>");
		out.println("<body>");
		out.println("<form action = 'squareroot'>");
		out.println("<input type = 'text' name = 'number' value = '"+num3+"'>");
		out.println("<button> ClICK HERE </button>");
		out.println("<h5>'"+CreationTime+"'</h5>");
		out.println("<h5>'"+lastAccessedTime+"'</h5> ");
		out.println(session1.getId());
		out.println(sessionId1);
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

}
