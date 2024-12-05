package com.deloitte.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallableStatementDemo {
	
    public static void main(String[] args) throws Throwable {
        
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/my_database";
        String username = "root";
        String password = "9941119940#@!";
        Connection connection = DriverManager.getConnection(url, username, password);
        
        String query = "call new_procedure";
        CallableStatement callable = connection.prepareCall(query);
        ResultSet rs = callable.executeQuery();
        while(rs.next()) {
        	
        	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
        }
    
    
    
    }

}
