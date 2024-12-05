package com.deloitte.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<Integer,String>();
		h1.put( 1,"One");
		h1.put(2,"Two");
		h1.put(3, "Three");
		h1.put(4, "Four");
		h1.put(5, "Five");
		//h1.put(null,"nine");
		h1.put(10,null);

		System.out.println(h1);
		System.out.println("***************************");
		for (Map.Entry<Integer,String> numeric : h1.entrySet()) {
			System.out.println(numeric.getKey()+ " "+numeric.getValue());
		}

		HashMap<Integer, String> h2 = new HashMap<Integer,String>();
		h2.put(6,"Six");
		h2.put(7,"Seven");
		h2.put(8,"Eight");

		h2.putAll(h1);
		System.out.println("***************************");
		for (Map.Entry<Integer,String> numeric : h2.entrySet()) {
			System.out.println(numeric.getKey()+ " "+numeric.getValue());
		}

		System.out.println("************To Print only the even key values ****************");
		for (Integer key : h2.keySet()) {
			if(key==2||key==4||key==6||key==8||key==10||key==null) {
				System.out.println(key+ " "+h2.get(key));
			}
		}
		System.out.println("***************************");
		System.out.println(h2.containsKey(7));
		System.out.println(h2.containsValue("saturday"));
		
		System.out.println("****************using iterator on Integer****************");
		Set<Integer> keys = h2.keySet();
		Iterator<Integer> it01 = keys.iterator();
		while(it01.hasNext()) {
			System.out.println(it01.next());
		}
		
		System.out.println("****************using iterator on String****************");
		Iterator<String> it02 = h2.values().iterator();
		while(it02.hasNext()) {
			System.out.println(it02.next());
		}
	}
}