package com.deloitte.java.basics;

public class Student {
	
	public int rollNo;
	public String name;
	
	public void print()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		System.out.println(student1.name);
		System.out.println(student1.rollNo);
		student1.print();
		
		student1.name="john";
		student1.rollNo= 10;
		
		System.out.println(student1.name);
		System.out.println(student1.rollNo);
		student1.print();
		
		student2.name="fir";
		student2.rollNo= 15;
		
		System.out.println(student2.name);
		System.out.println(student2.rollNo);
		student2.print();
		
		student3.name="dio";
		student3.rollNo= 04;
		
		System.out.println(student3.name);
		System.out.println(student3.rollNo);
		student3.print();

	}

}
