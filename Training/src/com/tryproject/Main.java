package com.tryproject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {

		Scanner sc = new Scanner(System.in);
		LibraryManager manager = new LibraryManager();

		while (true) {
			System.out.println("1. Add Book ");
			System.out.println("2. View Books");
			System.out.println("3. Search Book by ID");
			System.out.println("4. Search Book by Title");
			System.out.println("5. Issue Book ");
			System.out.println("6. Return Book ");
			System.out.println("7. Save & Exit ");
			System.out.println("Enter your choice ");

			try {
				int choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1:
					System.out.println("Enter Book ID:");
					int id = Integer.parseInt(sc.nextLine());
					System.out.println("Enter Title: ");
					String title = sc.nextLine();
					System.out.println("Enter Author: ");
					String author = sc.nextLine();
					System.out.println("Enter Quantity: ");
					int quantity = Integer.parseInt(sc.nextLine());
					manager.addBook(id, title, author, quantity);
					break;

				case 2:
					manager.displayBooks();
					break;

				case 3:
					System.out.println("Enter Book ID: ");
					int searchId = Integer.parseInt(sc.nextLine());
					Book foundById = manager.searchBookById(searchId);
					System.out.println(foundById != null ? foundById : "Book not found ");
					break;

				case 4:
					System.out.println("Enter Book Title: ");
					String searchTitle = sc.nextLine();
					Book foundbyTitle = manager.searchBookByTitle(searchTitle);
					System.out.println(foundbyTitle != null ? foundbyTitle : "Book not found");
					break;

				case 5:
					System.out.println("Enter Book ID to Issue ");
					int issueId = Integer.parseInt(sc.nextLine());
					manager.issueBook(issueId);
					break;
				case 6:
					System.out.println("Enter Book ID to return :");
					int returnId = Integer.parseInt(sc.nextLine());
					manager.returnBook(returnId);
					break;

				case 7:
					manager.saveToFile();
					System.out.println("Exiting...");
					sc.close();
					return;

				default:
					System.out.println("Invalid choice! Try again. ");
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid input! Please enter numbers when required..");

				
			}

		}
	}
}
