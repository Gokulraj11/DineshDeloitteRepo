package com.deloitte.util;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		StringTokenizer obj = new StringTokenizer("This_is_about_string_tozekenizer");
		System.out.println(obj.countTokens());
		while(obj.hasMoreTokens()) {
			System.out.println(obj.nextToken());
		}
		System.out.println("***********************************");
		StringTokenizer obj2 = new StringTokenizer("This_is_about_string_tozekenizer", "_");
		System.out.println(obj2.countTokens());
		while(obj2.hasMoreTokens()) {
			System.out.println(obj2.nextToken());
		}
		System.out.println("***********************************");		
		StringTokenizer obj3 = new StringTokenizer("This_is_about_string_tozekenizer", "_", true);
		System.out.println(obj3.countTokens());
		while(obj3.hasMoreTokens()) {
			System.out.println(obj3.nextToken());
		}
		System.out.println("***********************************");
		

	}

}
