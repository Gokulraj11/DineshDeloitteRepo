package com.deloitte.crud.dao.practice;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/employeeinsert")
public class AddEmployeeServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    try {
	        int emp_id = Integer.parseInt(request.getParameter("emp_id"));
	        String emp_name = request.getParameter("emp_name");
	        String emp_dept = request.getParameter("emp_dept");

	        System.out.println("Received emp_id: " + emp_id);
	        System.out.println("Received emp_name: " + emp_name);
	        System.out.println("Received emp_dept: " + emp_dept);

	        Employee employee = new Employee(emp_id, emp_name, emp_dept);
	        EmployeeDAO dao = new EmployeeDAO();
	        int result = dao.addEmployee(employee);

	        PrintWriter out = response.getWriter();
	        if(result > 0) {
	            out.println("<h1>Employee details successfully added!</h1>");
	        } else {
	            out.println("<h1>Error while adding details.</h1>");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}