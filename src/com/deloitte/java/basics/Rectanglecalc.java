package com.deloitte.java.basics;

public class Rectanglecalc {
	
	public static int calculateperimeter(int length, int breadth) {
		return 2 * (length + breadth);
	}
	
	public static int calculateArea(int length, int breadth) {
		return length * breadth;
	}

	public static void main(String[] args) {
		int length = 8;
		int breadth = 3;
		
		int area = calculateArea(length, breadth);
		int perimeter = calculateperimeter(length , breadth);
		
		System.out.println("area of rectangle:" +area);
		System.out.println("perimeter of rectangle:" +perimeter);
	}
}
