package com.deloitte.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SoccerTeam{
	int rollno;
	String name;
	int age;
	
	public SoccerTeam(int rollno,String name,int age) {
		this.rollno=rollno;
		this.name=name;
		this.age=age;		
	}

    public String toString(){
		return "Student [rollno=" +rollno +",name=" +name +",age=" +age +"]";
    }
}
public class CollectionSortingComparator1 {

	public static void main(String[] args) {
		
		Comparator<SoccerTeam> comp = new Comparator<SoccerTeam>() {

			@Override
			public int compare(SoccerTeam o1, SoccerTeam o2) {
				if(o1.rollno > o2.rollno)
				return 1;
				else
					return -1;
			}
		};
		
		List<SoccerTeam> obj = new ArrayList<SoccerTeam>();
		obj.add(new SoccerTeam(1011, "mark", 15));
		obj.add(new SoccerTeam(1226, "JOHN", 22));
		obj.add(new SoccerTeam(1147,"SAM" , 18));
		obj.add(new SoccerTeam(1284, "aLEX", 24));

		System.out.println(obj);
		
		Collections.sort(obj,comp);
		System.out.println(obj);
	}

}
