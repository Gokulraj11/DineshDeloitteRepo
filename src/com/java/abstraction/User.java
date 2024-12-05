package com.java.abstraction;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no.of units to buy");
		int quantity=scan.nextInt();
		int cost_per_unit = 100;
		
		Ecommerce flipkart = new Flipkart();
		Ecommerce myntra = new Myntra(); 
		Ecommerce amazon = new Amazon();
		
		System.out.println("\n***FLIPKArt***");
		flipkart.printdetails(quantity, "Flipkart",quantity * 100 > 1000 ?"10" : "5");
		System.out.println("\n***AMAZON***");
		amazon.printdetails(quantity, "AMAZON",quantity * 100 > 1000 ?"15" : "5");
		System.out.println("\n***MYNTRA***");
		myntra.printdetails(quantity, "myntra",quantity * 100 > 1000 ?"20" : "5");
		
		scan.close();
	
	}

}
