package com.deloitte.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatements {

    public static void main(String[] args) throws Throwable {
        
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/my_database";
        String username = "root";
        String password = "9941119940#@!";
        Connection connection = DriverManager.getConnection(url, username, password);
        
        String query = "INSERT INTO EMP (emp_id, emp_name, emp_dept, emp_ph) VALUES(?, ?, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(query);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your Employee_id: ");
        int emp_id = sc.nextInt();
        
        sc.nextLine(); 
        System.out.println("Enter your Employee_name: ");
        String emp_name = sc.nextLine();
        
        System.out.println("Enter your Employee_dept: ");
        String emp_dept = sc.nextLine();
        
        System.out.println("Enter your Employee_ph: ");
        String emp_ph = sc.nextLine();
        
        ps.setInt(1, emp_id);     
        ps.setString(2, emp_name);   
        ps.setString(3, emp_dept);   
        ps.setString(4, emp_ph);     
        
        int row = ps.executeUpdate();
        System.out.println(row + " row(s) inserted.");
        
        connection.close();
        ps.close();
        sc.close();
    }
}

