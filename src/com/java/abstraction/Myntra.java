package com.java.abstraction;

public class Myntra extends Ecommerce {
	
	public double discount(double amount) {
		if(amount > 1000) {
			amount *= 0.15;//15%
		}
		return amount;
	}	
}

