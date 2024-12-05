package com.deloitte.collections;

import java.util.LinkedHashSet;

public class LinkedSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> list1 = new LinkedHashSet<String>();
		list1.add("First");
		list1.add("Second");
		list1.add("First");
		list1.add("Third");
		list1.add("First");
		list1.add("Fourth");
		list1.add("Fifth");
		System.out.println(list1);

		LinkedHashSet<Integer> list2 = new LinkedHashSet<Integer>();
		list2.add(15);
		list2.add(4);
		list2.add(20);
		list2.add(15);
		list2.add(6);
		list2.add(4);
		list2.add(69);
		System.out.println(list2);

		list1.addFirst("Z");
		System.out.println("After adding Z at the beginning: " + list1);
		
		list2.removeLast();
		System.out.println("After removing the last element: " +list2);
		
		list1.addLast("F");
        System.out.println("After adding F at the end: " + list1);
        
        list2.removeFirst();
        System.out.println("After removing the first element: " +list2);




	}

}
