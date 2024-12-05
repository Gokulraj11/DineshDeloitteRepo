package com.deloitte.util;

import java.util.Arrays;

public class ArraysUtilExample {

	public static void main(String[] args) {
		
		Object arr3[] = {"str","htr","ftr"};
		int arr[] = {15,78,14,32,20,78,3};
		
		System.out.println("*****Before Sorting*****");
		for(int i : arr) {
			System.out.println(i);
		}
		System.out.println("*****After Sorting*****");
		Arrays.sort(arr);
		for(int i : arr) {
			System.out.println(i);
		}
		System.out.println("****Binary search*****");
		int index = Arrays.binarySearch(arr, 32);
		System.out.println(index);
		
		int arr2[] = {4,34,38,69,10,52,20};
		System.out.println(arr2.equals(arr));
		
		System.out.println("*****fill with String*****");
		Arrays.fill(arr3, "FIr");
		for(Object i : arr3) {
			System.out.println(i);
		}
		
		
	}

}
