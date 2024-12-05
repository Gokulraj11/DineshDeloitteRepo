package com.deloitte.java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowandCustomExample {

	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your age: ");
		
		try {
			int age = scan.nextInt();
			if(age > 20 & age < 40) {
				System.out.println("your eligible");
			}
			else {
				throw new AgeException("your age should be above 20 and below 40");
			}
		}
		
		catch (AgeException e) {
			System.out.println("age Exception: " +e.getMessage());
		}
		
		catch (InputMismatchException e) {
			System.out.println("enter a valid integer: ");
		}
	
		catch (Exception e) {
			System.out.println("Something went wrong");
		}
		
		finally{
			scan.close();
		}
	}
}
