package com.deloitte.collections;

import java.util.TreeSet;
import java.util.Scanner;

public class TreeSetExample {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number to check if its exists: ");
		int check = scan.nextInt();
		
		TreeSet<Integer> tr1 = new TreeSet<Integer>();
		tr1.add(18);
		tr1.add(29);
		tr1.add(24);
		tr1.add(20);
		tr1.add(20);
		tr1.add(30);
		System.out.println(tr1.contains(check));
		System.out.println(tr1);
		
		TreeSet<String> tr2 = new TreeSet<String>();
		tr2.add("zero");
		tr2.add("First");
		tr2.add("four");
		tr2.add("three");
		tr2.add("four");
		tr2.add("fifth");
		tr2.add("zero");
		System.out.println(tr2); //order is not maintained no duplication
		
		tr1.remove(24);
        System.out.println("TreeSet after removing 24: " + tr1);
        
        System.out.println("First element in String TreeSet: " + tr2.first());
        
        System.out.println("Last element in String TreeSet: " + tr2.last());
        		
	}

}
