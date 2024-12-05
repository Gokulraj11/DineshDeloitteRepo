package com.deloitte.jdbc.dao;

public class JdbcEmpDemo {
	
	public static void main (String [] args) throws Exception {
		
		EmployeeDao employee01 = new EmployeeDao();
		Employee employee = employee01.getEmployee(9);
		
	}

}
