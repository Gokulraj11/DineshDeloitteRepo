package com.deloitte.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class HelloWorldExample extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		ServletContext ctx = getServletContext();
		String str1 = ctx.getInitParameter("hello1");
		
		ServletConfig cfg = getServletConfig();
		String str = cfg.getInitParameter("hello");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1> HELLO WORLD </h1>");
		out.println(str1);
		out.println(str);
		out.println("</body>");
		out.println("</html>");
	}

}
