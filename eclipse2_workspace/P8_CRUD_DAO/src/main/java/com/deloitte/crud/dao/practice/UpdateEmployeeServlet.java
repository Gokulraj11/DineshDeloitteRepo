package com.deloitte.crud.dao.practice;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/employeeupdate")
public class UpdateEmployeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int emp_id = Integer.parseInt(request.getParameter("emp_id"));
        String emp_name = request.getParameter("emp_name");
        String emp_dept = request.getParameter("emp_dept");

        // Create an Employee object
        Employee employee = new Employee(emp_id, emp_name, emp_dept);

        EmployeeDAO dao = new EmployeeDAO();
        int result = 0;
		try {
			result = dao.updateEmployee(employee);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        PrintWriter out = response.getWriter();
        if(result > 0) {
            out.println("<h1>Employee details successfully updated!</h1>");
        } else {
            out.println("<h1>Error while updating details.</h1>");
        }
    }
}
