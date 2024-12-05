package com.deloitte.java.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.stream.Stream;

public class StreamApiExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(3);
		list.add(15);
		list.add(20);
		list.add(8);
		System.out.println("********************************");
		list.forEach(n->System.out.println(n));
		
		System.out.println("********************************");
		Stream<Integer> stream = list.stream();
		stream.sorted().forEach(n->System.out.print(n));
		
		System.out.println("********************************");
		Random rand = new Random();
		rand.ints(1,50).limit(10).forEach(n->System.out.println(n));
		
		System.out.println("********************************");
		Stream<Integer> stem = list.stream();
		stem.filter(n->n>10).map(n->n*2).forEach(n->System.out.println(n));
		
		System.out.println("********************************");
		HashMap<Integer, String> list2 = new HashMap<Integer, String>();
		list2.put(1501, "A");
		list2.put(1502, "B");
		list2.put(1503, "C");
		list2.put(1504, "D");
		System.out.println("*********************************");
		list2.forEach((n,m)->System.out.println(n+" "+m));
	}

}
