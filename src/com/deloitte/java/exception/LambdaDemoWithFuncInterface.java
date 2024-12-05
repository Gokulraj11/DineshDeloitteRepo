package com.deloitte.java.exception;

@FunctionalInterface
interface LambdaDemo{
	void student(int Rollno,String name);
}

@FunctionalInterface
interface LengthDemo{
	 int getLength(String name2);
}


public class LambdaDemoWithFuncInterface {

	//public void Student(int Rollno,String name) {
		//System.out.println("Rollno: "+ Rollno+ "Name: " +name);
	//}
	//p/ublic int Getlength(String name2) {
		//return name2.length();	
	//}

	public static void main(String [] args) {

		LambdaDemo lam = (Rollno,name) -> {System.out.println("Rollno: "+ Rollno+ "Name: " +name);};
		lam.student(50211,"Dinesh");

		LengthDemo len = (name2) -> name2.length();
		System.out.println(len.getLength("LambdaExpressionDemo"));
	}
}
