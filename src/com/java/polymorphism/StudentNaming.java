package com.java.polymorphism;

import java.util.Scanner;

public class StudentNaming {
    String name;
	
	public StudentNaming(String name) {
		this.name = name;
	}
	public StudentNaming() {
		this.name = "Unknown";
	}
	public void printnames() {
		System.out.println("Student name:" +name);
	}
	
	public static void main(String[] args) {
		Scanner stu = new Scanner(System.in);
		System.out.println("enter first student name or skip:");
		String firstname = stu.nextLine();
		
		StudentNaming student1;
		if(firstname.isEmpty()) {
			student1 = new StudentNaming();
		}
		else {
			student1 = new StudentNaming(firstname);
		}
		System.out.println("enter second student name or skip:");
		String secondname = stu.nextLine();
		StudentNaming student2;
		if(secondname.isEmpty()) {
			student2 = new StudentNaming();
		}
		else {
			student2 = new StudentNaming(secondname);
		}
		System.out.println("student details:");
		student1.printnames();
		student2.printnames();
		
		stu.close();
	}
}
