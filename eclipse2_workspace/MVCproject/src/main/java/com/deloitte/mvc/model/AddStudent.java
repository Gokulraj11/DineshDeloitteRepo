package com.deloitte.mvc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddStudent {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/school"; 
	private static final String DB_USERNAME = "root";  
	private static final String DB_PASSWORD = "9941119940#@!";  

	public int addStudent(String stud_name, String stud_pass) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {

			String sql = "INSERT INTO students (stud_name, stud_pass) VALUES (?, ?)";
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setString(1, stud_name);
				pstmt.setString(2, stud_pass);

				return pstmt.executeUpdate(); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;  
		}
	}   
	public boolean checklogin(String stud_name, String stud_pass) throws ClassNotFoundException {
        boolean check = false;
        
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD))
		{
            String query = "SELECT * FROM students WHERE emp_name = ? AND emp_pass = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, stud_name);
            ps.setString(2, stud_pass);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                check = true; 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }
}
