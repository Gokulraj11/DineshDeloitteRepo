package com.deloitte.java.basics;

public class StaticExample {
		
	static void example() {
		System.out.println("First Line");
	}
	public void examplemethod() {
		System.out.println("not the static method");
	}
	
public static void main(String [] args) {
	
	example();
	
	StaticExample exm = new StaticExample();
	exm.examplemethod();
	}
}
