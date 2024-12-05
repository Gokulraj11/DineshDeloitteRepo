package com.deloitte.java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithCatchExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Enter ur operation to calculate");
			System.out.println("ADDITION type (+)");
			System.out.println("SUBRACTION type (-)");
			System.out.println("MULTIPLY type (*)");
			System.out.println("DIVISION type (/)");
			
			char operator = scan.next().charAt(0);

			System.out.print("enter first number: ");
			double num1 = scan.nextDouble();

			System.out.print("enter second number: ");
			double num2 = scan.nextDouble();
		
			double Total = 0;
			switch(operator) 
			{
			case'+': 
				System.out.println("using addition");
				Total = num1 + num2;
				break;

			case'-': 
				System.out.println("using subraction");
				Total = num1-num2;
				break;

			case'*': 
				System.out.println("using multiplication");
				Total = num1*num2;
				break;

			case'/': 
				System.out.println("using division");
				if(num2==0) {
					System.out.println("Error: value cannot be zero");
					break;
				}
				Total = num1/num2;
				break;
				
			default:
				System.out.println("enter a valid operator");
				break;
			}
			System.out.println("THE RESULT = " +Total);
		}
		catch (InputMismatchException e) {
			System.out.println("InputMismatchException: enter a valid Integer ");
		}
		catch (Exception e){
			e.printStackTrace();
			System.out.println("Something went wrong");
		}
		scan.close();
	}
}