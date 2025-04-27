package com.encapsulation.BankAccount;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Initial Balance :");	
		double InBalance = sc.nextDouble();
		
		BankAccount b = new BankAccount(InBalance);
		
		while(true) {
		System.out.println("-*-*-*-* MENU *-*-*-*-");
		System.out.println("1.Withdraw");
		System.out.println("2.Deposit");
		System.out.println("3.Check Balance");
		System.out.println("4.Exit");
		System.out.println("Enter your choice : ");
		int ch = sc.nextInt();
		
		
			switch (ch) {
			case 1 : System.out.println("Enter Withdrawal Amount : ");
			double wAmt = sc.nextDouble();
			b.withdraw(wAmt);
			break;
			
			case 2 : System.out.println("Enter Amount for Deposition : ");
			double dAmt = sc.nextDouble();
			b.deposit(dAmt);
			break;
			
			case 3 :System.out.println(b.getBalance());
			break;
			
			case 4:
                System.out.println("Exiting...");
                sc.close();  // Closing the scanner when the program ends
                return;
			
			default : System.out.println("Invalid choice : ");
			
			
			
/*
this code correctly follows the encapsulation principles by:

1) Using private fields (balance) to hide internal data.

2) Providing public methods (deposit(), withdraw(), getBalance()) to control access and modification of that data.

3) Ensuring that the balance is only changed through valid operations (via withdraw() and deposit() methods),
   and not directly modified by other classes.
			 */

			
			
				
			}
			
			
		}
		
	}

}
