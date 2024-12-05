package com.deloitte.java.basics;

public class Distance {

	public static int convertKmtometers(int kilometer) {
		return kilometer * 1000;
		
	}
	
	public static void main(String[] args) {
		
		int distanceKm = 2;
		int distanceMm = convertKmtometers(distanceKm);
		System.out.println("distance kilometer to meters=" +distanceMm );
	}

}
