package com.java.polymorphism;

import java.util.Scanner;

public class MethodOverloading {

	public MethodOverloading (String A,String B) {
		System.out.println("the combination of strings are:" +(A + B));
	}
	public MethodOverloading (int A,int B) {
		System.out.println("the Sum of two numbers Are: "+(A + B));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do u want to enter a integer or string? Enter as int or string");
		String choice = sc.nextLine();
		
		if(choice.equals("int")) {
			System.out.println("Enter two integer");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			new MethodOverloading(num1, num2);
		}
		else if(choice.equals("string")) {
			System.out.println("enter two string values:");
			String name1 = sc.next();
			String name2 = sc.next();
			new MethodOverloading(name1, name2);
		}
		else {
			System.out.println("enter a valid choice int or string");
		}	

		sc.close();

	}

}
