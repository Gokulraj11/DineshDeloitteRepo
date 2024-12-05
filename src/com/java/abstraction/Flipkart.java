package com.java.abstraction;

public class Flipkart extends Ecommerce{

	public double discount(double amount) {
		if(amount > 1000) {
			amount *= 0.10;//10 percent
		}
		return amount;
	}


}
