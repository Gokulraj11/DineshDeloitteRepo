package com.deloitte.mvc.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.deloitte.mvc.model.AddStudent;


@WebServlet("/loginstudent")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String stud_name = request.getParameter("stud_name");
		String stud_pass = request.getParameter("stud_pass");
		
		AddStudent addStudent = new AddStudent();
		
		boolean check = false;
		try {
			check = addStudent.checklogin(stud_name,stud_pass);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		if(check) {
			request.setAttribute("message", "Successfully logged in " +stud_name);
		}else {
			request.setAttribute("message", "invalid username and password");
		}
		
		request.getRequestDispatcher("/Result.jsp").forward(request, response);

	}
}
