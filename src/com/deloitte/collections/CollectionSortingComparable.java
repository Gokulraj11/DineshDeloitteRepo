package com.deloitte.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class FootballTeam implements Comparable<FootballTeam>{

	int rollno;
	String playerName;
	int age;

	public FootballTeam(int rollno,String playername,int age){
		this.rollno=rollno;
		this.playerName=playername;
		this.age=age;
	}
	public String toString() {
		return "FootballTeam [rollno=" +rollno +",playername=" +playerName +",age=" +age +"]";

	}
	@Override
	public int compareTo(FootballTeam st) {
		if(age==st.age) 
			return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
	}
}

public class CollectionSortingComparable {

	public static void main(String[] args) {

		List<FootballTeam> obj = new ArrayList<FootballTeam>();
		obj.add(new FootballTeam(1011, "mark", 15));
		obj.add(new FootballTeam(1226, "JOHN", 22));
		obj.add(new FootballTeam(1147,"SAM" , 18));
		obj.add(new FootballTeam(1284, "aLEX", 24));

		System.out.println(obj);

		Collections.sort(obj);
		
		System.out.println(obj);

	}
}
