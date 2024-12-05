package com.deloitte.crud.practice;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/addemployee")
public class AddEmployeePractice extends HttpServlet {

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
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int emp_id = Integer.parseInt(request.getParameter("emp_id"));
		String emp_name = request.getParameter("emp_name");
		String emp_dept = request.getParameter("emp_dept");
		String emp_ph = request.getParameter("emp_ph");
		
		try {
			Statement statement = connection.createStatement();
			int res = statement.executeUpdate("insert into EMP values("+emp_id+",'"+emp_name+"','"+emp_dept+"','"+emp_ph+"')");
			PrintWriter out = response.getWriter();
			if(res > 0) {

				out.println("<h1> A Employee details have successfully Added</h1>");
			}
			else {
				out.println("<h1> Error while adding details </h1>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
