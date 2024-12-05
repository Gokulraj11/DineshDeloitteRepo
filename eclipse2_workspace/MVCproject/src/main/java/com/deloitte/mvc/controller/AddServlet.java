package com.deloitte.mvc.controller;

import com.deloitte.mvc.model.AddStudent;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/insertstudent")
public class AddServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String stud_name = request.getParameter("stud_name");
        String stud_pass = request.getParameter("stud_pass");

        AddStudent addStudent = new AddStudent();
        
        if (stud_name == null || stud_name.isEmpty() || stud_pass == null || stud_pass.isEmpty()) {
            request.setAttribute("message", "Please provide valid credentials (both name and password).");
            request.getRequestDispatcher("/Result.jsp").forward(request, response);
            return;
        }
        
        int result = 0;
		try {
			result = addStudent.addStudent(stud_name, stud_pass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
        if (result > 0) {
            request.setAttribute("message", "Student added successfully!");
        } else {
            request.setAttribute("message", "Error adding student.");
        }

        request.getRequestDispatcher("/Result.jsp").forward(request, response);
        
        response.sendRedirect("ViewServlet");
    
    }
}
