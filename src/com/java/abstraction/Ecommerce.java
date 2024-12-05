package com.java.abstraction;

public abstract class Ecommerce {
	int cost_per_unit = 100;
	
	
	public double calctotal(int quantity) {
		double amount = quantity * cost_per_unit;
		System.out.println(+amount);
		
		if(amount < 1000) {
			amount *= 0.05;
		}
		return amount;
	}
	public abstract double discount(double amount);
	
	public void printdetails(int quantity, String Name,String disc_perc) {
		double amount =calctotal(quantity);
		amount = discount(amount);
		
		System.out.println("Welcome to: " +Name);
		//System.out.println("Amount to be paid: "+final_amount);
		System.out.println("Amount of discount: " +amount);
		System.out.println("Discount applied: "+disc_perc);
	}

}
