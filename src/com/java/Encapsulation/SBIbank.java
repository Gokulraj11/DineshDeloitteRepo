package com.java.Encapsulation;

class SBIbank {
	 private String username = "din123";  
	 private String password = "wil123";  
	 private double balance = 2000.0;      

	 public boolean authenticate(String user, String pass) {
	     return this.username.equals(user) && this.password.equals(pass);
	 }
	 public void deposit(double amount) {
	     if (amount > 0) {
	         balance += amount;
	         System.out.println("Transaction successful, your balance amount is " + balance);
	     } else {
	         System.out.println("Invalid amount. Deposit failed.");
	     }
	 }
	 public void withdraw(double amount) {
	     if (amount > 0 && amount <= balance) {
	         balance -= amount;
	         System.out.println("Successful, your balance amount is " + balance);
	     } else {
	         System.out.println("Transaction declined");
	     }
	 }
	 public double getBalance() {
	     return balance;
	     }
	 }