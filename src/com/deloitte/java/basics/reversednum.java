package com.deloitte.java.basics;

import java.util.Scanner;

public class reversednum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the numbers: ");
		int num = sc.nextInt();
		
		int reverse = 0;
		
		while(num != 0)
		{
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}
		
		System.out.println("reveresed number: "+reverse);
		
		sc.close();
	}

}
