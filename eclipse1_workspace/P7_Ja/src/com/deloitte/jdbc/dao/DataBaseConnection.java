package com.deloitte.jdbc.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DataBaseConnection {
	
	private static DataBaseConnection instance;
	private Connection connection;
	
	FileInputStream fin = new FileInputStream("C:\\Users\\dines\\eclipse-workspace\\P7_Ja\\DataBaseConfig.properties");
	Properties prop = new Properties();
	
	private DataBaseConnection() throws Throwable {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//String url = "jdbc:mysql://localhost:3306/my_database";
		//String username = "root";
		//String password = "9941119940#@!";
		prop.load(fin);
		Class.forName(prop.getProperty("jdbc.mysql.driver"));
		
		connection = DriverManager.getConnection(prop.getProperty("jdbc.dev.url"),prop.getProperty("jdbc.dev.user"),prop.getProperty("jdbc.dev.password"));
	}

	public static DataBaseConnection getInstance() throws Throwable {
		if(instance==null) {
			instance = new DataBaseConnection();
		}
		return instance;
	}

	public Connection getConnection() {
		// TODO Auto-generated method stub
		return connection;
	}
}
