package com.deloitte.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter for nummber of elements: ");
		int in =sc.nextInt();
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
			
		for(int j= 0; j < in;j++) {
			System.out.println("enter number" +(j+1) +":");
			arr1.add(sc.nextInt());
		}
		System.out.println(arr1);
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(8);
		arr2.add(24);
		arr2.add(58);
		arr2.add(11);
		
		System.out.println("****Adding two array lists*****");
		arr1.addAll(arr2);
		System.out.println(arr1);

		//arr1.sort(null);
		
		arr2.set(2, 78);
		System.out.println("*****Replacing a number at the index*****");
		System.out.println(arr2);

		System.out.println("*****Printing the size of a array*****:");
		System.out.println(arr1.size());

		System.out.println(arr1.isEmpty());

		System.out.println("*****Checking the index from arraylist1*****");
		System.out.println(arr1.indexOf(58));

		arr1.add(4, 15);
		System.out.println("*****adding a value in the given index*****");
		System.out.println(arr1);

		Collections.sort(arr1);
		System.out.println("*****sorting array*****");
		System.out.println(arr1);

		Iterator<Integer> it = arr1.iterator();
		while (it.hasNext())
		{
			Integer i = it.next();
			if(i < 10) {
				it.remove();
			}
		}
		System.out.println("Removing values below 10 using iterator");
		System.out.println(arr1);
		
		ListIterator<Integer> it02 =arr1.listIterator();
		System.out.println("*****forward direction****");
		while(it02.hasNext()) {
			System.out.println(it02.next());
		}
		ListIterator<Integer> it03 = arr1.listIterator(arr1.size());
		System.out.println("******backward direction*******");
		while(it03.hasPrevious()) {
			System.out.println(it03.previous());
		}}}