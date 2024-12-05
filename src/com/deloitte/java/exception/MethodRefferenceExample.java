package com.deloitte.java.exception;

@FunctionalInterface
interface MethodReff{
	void setMessage();
}

@FunctionalInterface
interface MethodReffDemo{
	void display(int Rollno,String name);
}

class MethodRefference{
	
	public MethodRefference(){
		System.out.println("This message Using the Constructor Class");
	}
	
	public void setMessage() {
		System.out.println("This is the Stated Message");
	}
	public static void setMessage2() {
		System.out.println("This message from the static class");
	}
	
	public static void student(int Rollno, String name) {
		System.out.println("Rollno: " +Rollno+" NAME: " +name);
	}
}
public class MethodRefferenceExample {
	
	public static void main(String[] args) {
		
		MethodRefference mreff = new MethodRefference(); //create a obj for subclass
		MethodReff ref1 = mreff::setMessage; //set a refference with interface using obj :: methodname;
		ref1.setMessage(); //call the method with the reffrence

		MethodReff ref2 = MethodRefference::setMessage2; //create obj since its STATIC can accessed by its class name 
		ref2.setMessage(); //call the method with the reffrence
		
		MethodReff ref3 = MethodRefference::new; //create a obj for constructor call use new for methodname
		ref3.setMessage();
		
		MethodReffDemo ref4 = MethodRefference::student;
		ref4.display(50211, "JOHN");
	}
}
