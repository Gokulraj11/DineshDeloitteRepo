package com.deloitte.mvc.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String DB_URL = "jdbc:mysql://localhost:3306/school"; 
	private static final String DB_USERNAME = "root";  
	private static final String DB_PASSWORD = "9941119940#@!";  


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)){
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM students");
			PrintWriter out = response.getWriter();
			out.println("<table border=1>");
			out.println("<tr>");
			out.println("<th>");
			out.println("<emp_name>");
			out.println("</th>");
			out.println("<th>");
			out.println("<emp_pass>");
			out.println("</th>");
			out.println("<th>");
			
			while(rs.next()) {
				
				out.println("<tr>");
				out.println("<td>");
				out.println(rs.getString(1));
				out.println("</td>");
				out.println("<td>");
				out.println(rs.getString(2));
				out.println("</td>");
				out.println("<td>");
			}
			out.println("</table>");

		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}


