package com.java.interfaces;

public class Grade5 implements Classes {

	@Override
	public void CalculateMethod(int avg) {
		if (avg>=(avg*(75/100))) {
			System.out.println("youre promoted");
		}
		else {
			System.out.println("youre not promoted");
		}
	}
}

