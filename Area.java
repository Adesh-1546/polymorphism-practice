package com.polymorphism.prac;

public class Area {
	public void area(double radius) {    //circle
		double area1 = 3.14 * radius ;
		System.out.println("Area of Circle is : "+area1);
	}
	public void area(int length , int width) { //rectangle
		int area2 = length * width ;
		System.out.println("Area of Rectangle is :  "+area2);
	}
	public void area(double base, double height){   //triangle
		double area3 = 0.5 * base * height ;
		System.out.println("Area of Triangle is : "+area3);
	}
	
	public static void main(String[] args) {
		Area a = new Area();
		a.area(4);               //circle
		a.area(20, 30);          //rectangle
		a.area(10, 20);          //triangle
	}

}
