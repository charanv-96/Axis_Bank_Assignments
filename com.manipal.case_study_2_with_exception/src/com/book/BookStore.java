package com.book;

import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookStore {

	public static int counter = 0;

	public static Book store[] = new Book[20];

	public void addBook(Book newBook) {

		store[counter] = newBook;
		counter++;
	}

	public void searchByTitle(String title) {

		for (Book b : store) {
			if (b != null) {
				if (b.getTitle().equals(title)) {

					displayBook(b.getBookId());

				} else if (b.getTitle() == null) {
					continue;
				}
			}

		}

	}

	public void searchByAuthor(String author) {

		for (Book b : store) {
			if (b != null) {

				if (b.getAuthor().equals(author)) {

					displayBook(b.getBookId());

				} else if (b.getTitle() == null) {
					continue;
				}

			}

		}

	}

	public void displayAll() {
		int c = 1;
		for (Book b : store) {
			if (b != null) {
				System.out.println("------------------------------------------------" + "Book" + c
						+ "------------------------------------------");
				displayBook(b.getBookId());
				c++;

			}

		}

	}

	public void displayBook(String BookId) {

		for (Book b : store) {
			if (b != null) {
				if (b.getBookId() == null) {
					continue;
				} else if (b.getBookId().equals(BookId)) {
					System.out.println("BookId : " + b.getBookId());
					System.out.println("Title : " + b.getTitle());
					System.out.println("Author : " + b.getAuthor());
					System.out.println("Price : " + b.getPrice());
					System.out.println("Category : " + b.getCategory());

				}

				else {
					continue;
				}

			}

		}

	}

	public void updateBook(String bookId) throws InvalidInputException {

		try {

			System.out.println("Enter new Title : ");
			Scanner sc = new Scanner(System.in);
			String t = sc.nextLine();
			System.out.println("Enter new Author : ");
			Scanner sc1 = new Scanner(System.in);
			String aut = sc1.nextLine();
			System.out.println("Enter new Price : ");
			Scanner sc2 = new Scanner(System.in);
			float pr = sc2.nextFloat();
			System.out.println("Enter new Category : ");
			Scanner sc3 = new Scanner(System.in);
			String cat = sc3.next();

			Book b1 = new Book(bookId, t, aut, cat, pr);

			boolean flag = false;

			for (Book b : store) {

				if (b != null) {
					if (b.getBookId().equals(bookId)) {
						flag = true;

						b.setAuthor(aut);
						b.setCategory(cat);
						b.setPrice(pr);
						b.setTitle(t);

					}

				}

			}

		} catch (InvalidInputException iie) {
			throw new InvalidInputException();
		}

	}

}
