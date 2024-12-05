package com.deloitte.crud.dao.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeConnection {
    
    private static final String url = "jdbc:mysql://localhost:3306/employee";
    private static final String username = "root";
    private static final String password = "9941119940#@!";

    public static Connection getconnection() throws SQLException, ClassNotFoundException {
    	Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, username, password);
    }
    
    public static void testConnection() throws ClassNotFoundException {
    	
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    	} catch (ClassNotFoundException e) {
    		e.printStackTrace();
    	}

        try (Connection connection = getconnection()) { 
            if (connection != null) {
                System.out.println("Connection successful!");
            } else {
                System.out.println("Connection failed!");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        testConnection();
    }
}
