package com.deloitte.java.basics;

class Thismethod{
	int rollno;
	String name;
	float fee;

	Thismethod(int rollno,String name,float fee){
		this.fee=fee;
		this.name=name;
		this.rollno=rollno;
	}
	void printdetails() {
		System.out.println(rollno+""+name+""+fee);
	}}

public class StudentMethod {
	public static void main (String[] args) {
		Thismethod t1 = new Thismethod(1501 ," dinesh ", 15000);
		Thismethod t2 = new Thismethod(1504 ," din ", 18000);
		t1.printdetails();
		t2.printdetails();

	}
}