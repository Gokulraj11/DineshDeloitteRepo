package com.deloitte.java.basics;

class Cat{
	
	int age = 5;
	Cat(String name) {
		System.out.println(name+" Meowww");
	}
	
	void CatDrink(){
		System.out.println("Cat drinks Milk");
	}
}

class Dog extends Cat{
	Dog(String name){
		super("seiko"); //accessing parent class constructor using SUPER key
		super.CatDrink(); //accessing parent class function using SUPER
		System.out.println(super.age); //accessing parent class variable
		System.out.println(name+" BOW BOW"); //accessing child class parameterized function
		
	}
	
}
public class SuperKeyExample {
	public static void main(String[] args) {
		Dog d1 = new Dog("Rocky");
	}

}
