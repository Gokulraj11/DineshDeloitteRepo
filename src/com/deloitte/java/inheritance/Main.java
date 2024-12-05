package com.deloitte.java.inheritance;

public class Main{ 
		public static void main(String []args) {
			Employe emp = new Employe();
			emp.name= "Victor";
			emp.age=24;
			emp.address="SDFG";
			emp.phoneno=54876954;
			emp.salary=20000;
			emp.Specialization="Analyst";
			
			System.out.println("Employee details: ");
			emp.employeprintdetails();
					
			Manager mg = new Manager();
			mg.name="MARK";
			mg.age=28;
			mg.address="DTYU";
			mg.phoneno=458216854;
			mg.salary=50000;
			mg.Department="Information Technology";
			
			System.out.println("Manager details: ");
			mg.managerprintdetails();
			
		}
	}

