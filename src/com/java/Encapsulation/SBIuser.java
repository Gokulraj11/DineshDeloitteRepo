package com.java.Encapsulation;
import java.util.Scanner;

public class SBIuser {
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     SBIbank bank = new SBIbank();

     System.out.print("Enter username: ");
     String username = scan.nextLine();
     System.out.print("Enter password: ");
     String password = scan.nextLine();

     
     if (bank.authenticate(username, password)) {
         System.out.println("Authentication successful.");
         System.out.println("1. Deposit 2. Withdraw");
         int choice = scan.nextInt();

         if (choice == 1) {
             System.out.print("Amount to deposit: ");
             double amount = scan.nextDouble();
             bank.deposit(amount);
         } else if (choice == 2) {
             System.out.print("Amount to withdraw: ");
             double amount = scan.nextDouble();
             bank.withdraw(amount);
         } else {
             System.out.println("Invalid");
         }
     } else {
         System.out.println("Incorrect username or password.");
     }
     scan.close();
 }
}
