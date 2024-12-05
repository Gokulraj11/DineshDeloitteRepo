package com.deloitte.crud.dao.practice;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/employeedelete")
public class DeleteEmployeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int emp_id = Integer.parseInt(request.getParameter("emp_id"));

        EmployeeDAO dao = new EmployeeDAO();
        int result = 0;
		try {
			result = dao.deleteEmployee(emp_id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        PrintWriter out = response.getWriter();
        if(result > 0) {
            out.println("<h1>Employee details successfully deleted!</h1>");
        } else {
            out.println("<h1>Error while deleting details.</h1>");
        }
    }
}
