package com.polymorphism.prac;

public class BankAccount {
	public void deposit(int amount) {
		System.out.println("Amount"+amount);
	}
	public void deposit(int amount, String mode) {
		System.out.println("Amount : "+ amount + " Mode: "+mode);
		
	}
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.deposit(500);
		b.deposit(700000,"Cheque");
	}

}
