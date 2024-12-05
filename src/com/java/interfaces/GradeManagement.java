package com.java.interfaces;

import java.util.Scanner;

public class GradeManagement {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter you grade: (5 or 10) ");
		int grade=scan.nextInt();
		
		if(grade==5){
			
			System.out.println("enter marks for subject");
			int sub1 = scan.nextInt();
			int sub2 = scan.nextInt();
			int sub3 = scan.nextInt();
			int sub4 = scan.nextInt();
			int avg =(sub1+sub2+sub3+sub4)/4;
			Grade5 final1 = new Grade5();
			final1.CalculateMethod(avg);
		}
		else if(grade==10) {
			System.out.println("enter marks for subject");
			int sub1 = scan.nextInt();
			int sub2 = scan.nextInt();
			int sub3 = scan.nextInt();
			int sub4 = scan.nextInt();
			int sub5 = scan.nextInt();
			int sub6 = scan.nextInt();
			int avg =(sub1+sub2+sub3+sub4+sub5+sub6)/4;
			Grade10 final2 = new Grade10();
			final2.CalculateMethod(avg);
			}
		else {
			System.out.println("enter a valid grade");
		}
		scan.close();
		return;

	}

}
	
	
	
	


