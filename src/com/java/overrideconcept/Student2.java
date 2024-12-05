package com.java.overrideconcept;

public class Student2 extends Teacher{
	
	String Name = "Dinesh";	
	final int Rollno =1501;
	
	public void StudentMethod() {
		System.out.println("this is a child class");
		//Rollno = 1301;
	}
	
	@Override
	public void TeacherMethod() {
		System.out.println("this is a parent from child class");
	}

}
