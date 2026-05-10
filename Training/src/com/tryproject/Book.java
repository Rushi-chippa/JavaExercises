package com.tryproject;

import java.io.Serializable;

public class Book implements Serializable {
	private int id;
	private String title;
	private String author;
	private int quantity;

	public Book(int id, String title, String author, int quantity) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getQuantity() {
		return quantity;
	}

	public void issueBook() {
		if (quantity > 0) {
			quantity--;
			System.out.println("Book issued successfully!");
		} else {
			System.out.println("Book is out of stock.");
		}
	}

	public void returnBook() {
		quantity++;
		System.out.println("Book returned successfully!");
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Title: " + title + ", Author: " + author + " , Quantity :" + quantity;
	}

}
