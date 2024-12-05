package com.deloitte.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee5{
	int rollno;
	String name;
	int age;
	
	public Employee5(int rollno,String name,int age) {
		this.rollno=rollno;
		this.name=name;
		this.age=age;		
	}

    public String toString(){
		return "Employee [rollno=" +rollno +",name=" +name +",age=" +age +"]";
    }
}
public class CollectionSortingComparator2 {

	public static void main(String[] args) {
		
		Comparator<Employee5> comp = new Comparator<Employee5>() {

			@Override
			public int compare(Employee5 o1, Employee5 o2) {
				return(o1.name.compareTo(o2.name));
			}
		};
		
		List<Employee5> obj = new ArrayList<Employee5>();
		obj.add(new Employee5(1011, "MARK", 15));
		obj.add(new Employee5(1226, "JOHN", 22));
		obj.add(new Employee5(1147,"SAM" , 18));
		obj.add(new Employee5(1284, "ALEX", 24));

		System.out.println(obj);
		
		Collections.sort(obj,comp);
		System.out.println(obj);
	}

}
