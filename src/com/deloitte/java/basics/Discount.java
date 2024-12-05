package com.deloitte.java.basics;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		
		int per_unit_cost = 100;
		double discount_perc = 10;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of units:");
		int units = sc.nextInt();
		int totalcost = units * per_unit_cost;
		
		if(totalcost<=1000)
		{
			System.out.println("Total amount to pay: "+totalcost);
		}
		else 
		{
		double discount = units * discount_perc;
		double finalcost = totalcost - discount;
		System.out.println("total discount: " +discount );
		System.out.println("total amount to pay: " +finalcost);
		}
		sc.close();
	}

}
