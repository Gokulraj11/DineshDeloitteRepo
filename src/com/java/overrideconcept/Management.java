package com.java.overrideconcept;

public class Management {
	

	public static void main(String[] args) {
		
		Teacher teach = new Teacher();
		System.out.println(teach.Dept);
		teach.TeacherMethod();
		
		Student2 stu = new Student2();
		System.out.println(stu.Name);
		System.out.println(stu.Rollno);
		stu.StudentMethod();
		
		System.out.println(stu.Dept);
		stu.TeacherMethod();

	}

}
