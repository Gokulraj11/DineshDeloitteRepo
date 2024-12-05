package com.deloitte.java.basics;

import java.util.Scanner;

public class greatesofthree {

	public static void main(String[] args) {
		
		//StaticExample Vc = new StaticExample();
		//System.out.println(StaticExample.num);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int A =sc.nextInt();
		
		System.out.println("Enter the first number: ");
		int B =sc.nextInt();
		
		System.out.println("Enter the first number: ");
		int C =sc.nextInt();
		
		if((A>=B)&&(A>=C)) {
			System.out.println("A is the largest num: "+A);
		}
		else if((B>=A)&&(B>=C)) {
			System.out.println("B is the largest num: "+B);
		}
		else {
			System.out.println("C is the largest num: "+C);
		}
		
		sc.close();
	}

}
