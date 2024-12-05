package com.java.polymorphism;

public class Metho {
	
	int add (int num1,int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		Metho mu = new Metho();
		System.out.println(mu.add(5, 4));
	}

}
