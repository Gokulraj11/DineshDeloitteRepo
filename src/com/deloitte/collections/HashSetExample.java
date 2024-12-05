package com.deloitte.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<Integer> ll1 = new HashSet<Integer>();
		System.out.println("Enter the number: ");
		ll1.add(scan.nextInt());
		ll1.add(scan.nextInt());
		ll1.add(scan.nextInt());
		ll1.add(scan.nextInt());
		ll1.add(scan.nextInt());
		ll1.add(scan.nextInt());
		System.out.println(ll1);//no duplication allowed , order is sorted 
		
		System.out.println("Enter a number to check if it exists in the set: ");
        int number = scan.nextInt();
        if (ll1.contains(number)) {
            System.out.println(number + "in the set.");
        } else {
            System.out.println(number + "not in the set.");
        }

		HashSet<String> ll2 = new HashSet<String>();
		System.out.println("enter a name: ");
		ll2.add(scan.nextLine());
		ll2.add(scan.nextLine());
		ll2.add(scan.nextLine());
		ll2.add(scan.nextLine());
		ll2.add(scan.nextLine());
		ll2.add(scan.nextLine());
		System.out.println(ll2);
		
		System.out.println("set using Iterator:");
        Iterator<String> it = ll2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        System.out.println("Enter a name to remove from the set: ");
        String name = scan.nextLine();
        if (ll2.remove(name)) {
            System.out.println(name + " has been removed.");
        } else {
            System.out.println(name + " was not found in the set.");
        }

        System.out.println("Updated names: " + ll2);
        
        ll2.clear();
        System.out.println("after clearing: " + ll2);
	}

}
