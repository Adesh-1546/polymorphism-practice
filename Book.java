package com.encapsulation.Book;

public class Book {
	private String author ;
	private String title ;
	private double price ;
	
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if (price > 0 ) {
			this.price = price;
		}else {
			System.out.println("Enter Positive Amount : ");
		}

	}

}
