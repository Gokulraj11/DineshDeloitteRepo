package com.deloitte.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;


	@WebServlet(
			urlPatterns = "/config",
			initParams = {@WebInitParam(name= "exercise", value = "Welcome To Deloitte"),}
			)
	
	public class ServletConfigPractice extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		PrintWriter out = res.getWriter();
		ServletConfig cfp = getServletConfig();
		String name = cfp.getInitParameter("exercise");
		out.println(name);	
	}

}
