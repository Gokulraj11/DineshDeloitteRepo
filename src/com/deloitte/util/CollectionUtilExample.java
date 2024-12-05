package com.deloitte.util;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionUtilExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(8);
		num.add(15);
		num.add(56);
		num.add(33);
		num.add(45);
		num.add(12);
		System.out.println(num);
		
		Collections.sort(num);
		System.out.println(num);

		int search = Collections.binarySearch(num, 45);
		System.out.println(search);
		
		System.out.println(Collections.max(num));
		System.out.println(Collections.min(num));
		
		Collections.reverse(num);
		System.out.println(num);
		
		Collections.shuffle(num);
		System.out.println(num);
		
		Collections.fill(num, 96);
		System.out.println(num);
				
	}

}
