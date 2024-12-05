package com.java.abstraction;

public class Amazon extends Ecommerce{
	
	public double discount(double amount) {

		if(amount > 1000) {
			amount *= 0.20;//20%
		}
		return amount;
	}
}
