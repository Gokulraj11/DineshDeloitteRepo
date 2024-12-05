package com.deloitte.mvc.controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testconnection {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/school";
        String DB_USERNAME = "root";
        String DB_PASSWORD = "9941119940#@!";
        
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
            e.printStackTrace();
        }
    }
}