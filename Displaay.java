package com.polymorphism.prac;

public class Displaay {
	public void display(String a) {
		System.out.println("String : "+a);
		
	}
	public void display(int p) {
		System.out.println("Interger : "+p);
		
	}
	public void display(int x , String y) {
		System.out.println("Integer : "+x + " and String : "+y);
		
	}
	public static void main(String[] args) {
		Displaay d = new Displaay();
		d.display("Adesh");
		d.display(5);
		d.display(10, "Adesh pol ");
		
	}
}
