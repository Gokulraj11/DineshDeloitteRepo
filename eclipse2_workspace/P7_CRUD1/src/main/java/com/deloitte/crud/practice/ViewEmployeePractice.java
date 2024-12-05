package com.deloitte.crud.practice;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/ViewEmployee")
public class ViewEmployeePractice extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
Connection connection = null;
	
	public void init() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url ="jdbc:mysql://localhost:3306/my_database";
		String username = "root";
		String password = "9941119940#@!";
		
		try {
			connection = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM EMP");
			PrintWriter out = response.getWriter();
			out.println("<table border=1>");
			out.println("<tr>");
			out.println("<th>");
			out.println("<emp_id>");
			out.println("</th>");
			out.println("<th>");
			out.println("<emp_name>");
			out.println("</th>");
			out.println("<th>");
			out.println("<emp_dept>");
			out.println("</th>");
			out.println("<th>");
			out.println("<emp_ph>");
			out.println("</th>");
			out.println("</tr>");
			
			while(rs.next()) {
				
				out.println("<tr>");
				out.println("<td>");
				out.println(rs.getInt(1));
				out.println("</td>");
				out.println("<td>");
				out.println(rs.getString(2));
				out.println("</td>");
				out.println("<td>");
				out.println(rs.getString(3));
				out.println("</td>");
				out.println("<td>");
				out.println(rs.getString(4));
				out.println("</td>");
				out.println("</tr>");
			}
			out.println("</table>");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	public void destroy() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
