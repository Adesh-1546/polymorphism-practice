package com.encapsulation.BankAccount;

public class BankAccount {
	private double  balance;
	
	public BankAccount(double balance) {
		if (balance > 0 ) {
			this.balance = balance;
		}else {
			System.out.println("Enter Positive Balance Amount");
		}
	}
	
	public void withdraw(double wAmt) {
		if (wAmt > 0 ) {
			if (wAmt <= balance) {
				balance = balance - wAmt ;
				System.out.println("Remaining Balance : "+balance);
			}else {
				System.out.println("Insufficient Balance ");
			}
		}else {
			System.out.println("Enter positive Withdrawal amount ");
		}
	}
	
	public void deposit(double dAmt) {
		balance = balance + dAmt ;
		System.out.println("Balance : "+balance);
		
	}

	public double getBalance() {
		return balance;
	}


	
	

}
