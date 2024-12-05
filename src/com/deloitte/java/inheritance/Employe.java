package com.deloitte.java.inheritance;

public class Employe extends Member{
	String Specialization;
	
	public void employeprintdetails() {
		printdetails();
		
		System.out.println("Specialization" +Specialization);
	}

}
