package com.deloitte.crud.dao.practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {
	
	public int addEmployee(Employee employee) throws ClassNotFoundException {
	    try (Connection connection = EmployeeConnection.getconnection()) {
	        String query = "INSERT INTO emp_table (emp_id, emp_name, emp_dept) VALUES (?, ?, ?)";
	        try (PreparedStatement statement = connection.prepareStatement(query)) {
	            statement.setInt(1, employee.getEmpId());
	            statement.setString(2, employee.getEmpName());
	            statement.setString(3, employee.getEmpDept());
	            int result = statement.executeUpdate();
	            
	            System.out.println("Rows affected: " + result);
	            return result;
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return 0; 
	    }
	}


    public int updateEmployee(Employee employee) throws ClassNotFoundException {
        try (Connection connection = EmployeeConnection.getconnection()) {
            String query = "UPDATE emp_table SET emp_name = ?, emp_dept = ? WHERE emp_id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, employee.getEmpName());
                statement.setString(2, employee.getEmpDept());
                statement.setInt(3, employee.getEmpId());
                return statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int deleteEmployee(int emp_id) throws ClassNotFoundException {
        try (Connection connection = EmployeeConnection.getconnection()) {
            String query = "DELETE FROM emp_table WHERE emp_id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, emp_id);
                return statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
