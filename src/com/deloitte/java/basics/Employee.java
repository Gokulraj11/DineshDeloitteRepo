package com.deloitte.java.basics;

public class Employee {

	public int id;
	public String name;
	public String empl_desig;
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		Employee emp2 = new	Employee();
		Employee emp3 = new Employee();
		
		emp1.id=15;
		emp1.empl_desig="analyst";
		emp1.name="suriya";
		
		emp2.id=1;
		emp2.empl_desig="cyber";
		emp2.name="riya";
		
		emp3.id=5;
		emp3.empl_desig="developer";
		emp3.name="sandy";
		
		System.out.println(emp1.id);
		System.out.println(emp1.name);
		System.out.println(emp1.empl_desig);
		
		System.out.println(emp2.id);
		System.out.println(emp2.name);
		System.out.println(emp2.empl_desig);
		
		System.out.println(emp3.id);
		System.out.println(emp3.name);
		System.out.println(emp3.empl_desig);
		
		
	}

}
