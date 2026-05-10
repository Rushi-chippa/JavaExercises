package com.tryproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class LibraryManager {

	@SuppressWarnings("unused")
	private List<Book> books = new ArrayList<>();
	@SuppressWarnings("unused")
	private final String FILE_NAME = "library.txt";

	public LibraryManager() throws ClassNotFoundException {
		loadFromFile();

	}

	public void addBook(int id, String title, String author, int quantity) {
		books.add(new Book(id, title, author, quantity));
		System.out.println("Book added successfully!");
	}

	public void displayBooks() {
		if (books.isEmpty()) {
			System.out.println("No Books available ");
		} else {
			for (Book b : books) {
				System.out.println(b);
			}
		}
	}

	@SuppressWarnings("unused")
	public Book searchBookById(int id) {
		for (Book b : books) {
			if (b.getId() == id) {
				return b;
			}
		}
		return null;
	}

	public Book searchBookByTitle(String title) {
		for (Book b : books) {
			if (b.getTitle().equalsIgnoreCase(title)) {
				return b;
			}
		}
		return null;
	}

	public void issueBook(int id) {
		Book book = searchBookById(id);
		if (book != null) {
			book.issueBook();
		} else {
			System.out.println("Book not found.");
		}
	}

	public void returnBook(int id) {
		Book book = searchBookById(id);
		if (book != null) {
			book.returnBook();
		} else {
			System.out.println("Book not found.");
		}
	}

	public void saveToFile() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
			oos.writeObject(books);
		} catch (IOException e) {
			System.out.println("Error saving data: " + e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	public void loadFromFile() throws ClassNotFoundException {
		@SuppressWarnings("unused")
		File file = new File(FILE_NAME);
		if (!file.exists()) {
			return;
		}
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {

			books = (List<Book>) ois.readObject();
		} catch (IOException e) {
			System.out.println("Error loading data: " + e.getMessage());
		}
	}
}
