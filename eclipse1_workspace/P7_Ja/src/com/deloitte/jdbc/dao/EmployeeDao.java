package com.deloitte.jdbc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDao implements UserDao{
	Connection connection;	
	Statement statement;
	ResultSet rs;
	DataBaseConnection dataBase;

	public void getConnection() throws ClassNotFoundException, SQLException {
		try{
			dataBase = DataBaseConnection.getInstance();
			connection = dataBase.getConnection();
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
	}

	public void closeConnection() throws SQLException {
		connection.close();
		statement.close();
		rs.close();
	}

	@Override
	public Employee getEmployee(int emp_id) throws Exception {

		Employee employee = new Employee();
		getConnection();
		String query = "DELETE FROM EMP WHERE emp_id=" + emp_id;
		statement = connection.createStatement();
		int rowsAffected = statement.executeUpdate(query);
		if (rowsAffected > 0) {
			System.out.println("Employee with ID " + emp_id + " was deleted.");
		} else {
			System.out.println("No employee found with ID " + emp_id + ".");
		}

		String query1 = "SELECT * FROM EMP";
		statement = connection.createStatement();
		rs = statement.executeQuery(query1);
		System.out.println("***************Remaining Employee details**************");
		while(rs.next()) {
			System.out.println(rs.getInt("emp_id")+" "+rs.getString("emp_name")+" "+rs.getString("emp_dept")+" "+rs.getString("emp_ph"));			
		}

		closeConnection();
		return employee;

	}

}
