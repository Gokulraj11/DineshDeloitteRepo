package com.deloitte.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class StatementDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/my_database";
		String username = "root";
		String password = "9941119940#@!";
		
		//String url01 = "jdbc:mysql://localhost:3306/my_database?user=root&password=9941119940#@!";
		//Connection connection = DriverManager.getConnection(url01);
		Connection connection = DriverManager.getConnection(url,username,password);
		//Properties prop = new Properties();
		//prop.put("user", "root");
		//prop.put("password", "9941119940#@!");
		//Connection connection = DriverManager.getConnection(url, prop);
		System.out.println(connection);
		//To exceute Create STatement 
		Statement statement = connection.createStatement();
		
		// executeQuery for only select  
		//executeUpdate for insert update delete
		// executemethod for all operation 
		
		//int result = statement.executeUpdate("INSERT INTO EMP (emp_id, emp_name, emp_dept, emp_ph) " + "VALUES (1, 'ferb', 'Dev', '333-333-3333')");
		//System.out.println(result);
		
		//int result1 = statement.executeUpdate("UPDATE EMP SET emp_name = 'dinesh' WHERE emp_id = 1");
		//System.out.println(result1);
		
		//int result2 = statement.executeUpdate("DELETE FROM EMP WHERE emp_dept = 'Sales'");
		//System.out.println(result2);
		
		
		ResultSet rs = statement.executeQuery("select * from EMP");
		while(rs.next()) {
			System.out.println(rs.getInt("emp_id")+" "+rs.getString("emp_name")+" "+rs.getString("emp_dept")+" "+rs.getString("emp_ph"));
		}
		
		ResultSetMetaData rsmd =rs.getMetaData();
		System.out.println(rsmd.getColumnCount());
		System.out.println(rsmd.getColumnName(2));
		System.out.println(rsmd.getColumnType(4));
		
		
		connection.close();
		statement.close();
		rs.close();
	}

}
