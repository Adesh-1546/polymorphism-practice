package com.polymorphism.prac;

public class Calculator {
	public void add(int a , int b) {
		System.out.println(a+b);
		
	}
	public void add(double p , double q) {
		System.out.println(p + q);
		
	}
	public void add(int x , int y , int z) {
		System.out.println(x+y+z);
		
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(2, 3);
		c.add(0.5, 4.2);
		c.add(4, 4, 8);
	}

}
