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
				if (b.getTitle() == title) {

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

				if (b.getAuthor() == author) {

					displayBook(b.getBookId());

				} else if (b.getTitle() == null) {
					continue;
				}

			}

		}

	}

	public void displayAll() {

		for (Book b : store) {
			if (b != null) {

				displayBook(b.getBookId());

			}

		}

	}

	public void displayBook(String BookId) {

		for (Book b : store) {
			if (b != null) {
				if (b.getBookId() == null) {
					continue;
				} else if (b.getBookId() == BookId) {
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

	public void updateBook(String bookId) {

		System.out.println("Enter new Title : ");
		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		System.out.println("Enter new Author : ");
		Scanner sc1 = new Scanner(System.in);
		String aut = sc1.next();
		System.out.println("Enter new Price : ");
		Scanner sc2 = new Scanner(System.in);
		float pr = sc2.nextFloat();
		System.out.println("Enter new Category : ");
		Scanner sc3 = new Scanner(System.in);
		String cat = sc3.next();

		for (Book b : store) {

			if (b != null) {
				if (b.getBookId() == bookId) {
					b.setAuthor(aut);
					b.setBookId(bookId);
					b.setTitle(t);
					b.setCategory(cat);
					b.setPrice(pr);
				}

			}

		}
		/*
		 * Book updated_book = new Book(bookId, t, aut, cat, pr);
		 * 
		 * int count = 0;
		 * 
		 * for (Book b : store) {
		 * 
		 * if (b != null) { if (b.getBookId() == bookId) { store[count] = updated_book;
		 * }
		 * 
		 * } count++;
		 * 
		 * }
		 */

	}

}
