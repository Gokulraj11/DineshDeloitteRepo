package com.deloitte.java.inheritance;

public class Manager extends Member{
	String Department;
	
	public void managerprintdetails() {
		printdetails();
		
		System.out.println("department: "+Department);
		
	}
}
