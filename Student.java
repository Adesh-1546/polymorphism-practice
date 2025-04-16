package com.polymorphism.prac;

public class Student {
	int rollno;
	String name ;
	public Student() {
		System.out.println("No parameter constructor");
	}
	public Student(int rollno) {
		this.rollno = rollno ; 
		System.out.println("Roll no : "+rollno);
	
	}
	public Student(int rollno, String name) {
		this.rollno = rollno;
		System.out.println("Roll no : "+rollno + "and Name is "+name);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student(2);
		Student s2 = new Student(3, "Adesh");
	}
	
}
