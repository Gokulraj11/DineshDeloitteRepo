package com.deloitte.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		System.out.println("Enter the number: ");
		ll1.add(scan.nextInt());
		ll1.add(scan.nextInt());
		ll1.add(scan.nextInt());
		ll1.add(scan.nextInt());
		System.out.println(ll1);
		
		LinkedList<String> ll2 = new LinkedList<String>();
		System.out.println("enter a name: ");
		ll2.add(scan.nextLine());
		ll2.add(scan.nextLine());
		ll2.add(scan.nextLine());
		ll2.add(scan.nextLine());
		System.out.println(ll2);
		
		Iterator<Integer> it = ll1.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		HashSet<Integer> Set = new HashSet<Integer>();
		Set.addAll(ll1);
		Set.size();
		System.out.println(Set);
	}

}
