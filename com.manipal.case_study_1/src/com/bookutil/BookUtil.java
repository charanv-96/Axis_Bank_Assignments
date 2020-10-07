package com.bookutil;

import java.util.Scanner;

import com.book.*;

public class BookUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookStore bs = new BookStore();

		boolean flag = true;
		while (flag) {
			System.out.println("Select the operation you want to perform");
			System.out.println("1. Add book to the store");
			System.out.println("2. Search book by author");
			System.out.println("3. Search book by title");
			System.out.println("4. Display all the books in the store");
			System.out.println("5. Search book by Book Id");
			System.out.println("6. Update a Book in the store");
			System.out.println("7. Exit");

			Scanner sc = new Scanner(System.in);

			int option = sc.nextInt();

			switch (option) {

			case 1: {
				System.out.println("Enter the Book Id :");
				Scanner sc1 = new Scanner(System.in);
				String bookId = sc1.next();

				System.out.println("Enter the title :");
				Scanner sc2 = new Scanner(System.in);
				String title = sc2.nextLine();

				System.out.println("Enter the author :");
				Scanner sc3 = new Scanner(System.in);
				String author = sc3.nextLine();

				System.out.println("Enter the category :");
				Scanner sc4 = new Scanner(System.in);
				String category = sc4.next();

				System.out.println("Enter the price :");
				Scanner sc5 = new Scanner(System.in);
				float price = sc5.nextFloat();

				Book b1 = new Book(bookId, title, author, category, price);

				bs.addBook(b1);
				break;
			}

			case 2: {
				System.out.println("Enter author's name :  ");
				Scanner sc4 = new Scanner(System.in);
				String author = sc4.nextLine();
				bs.searchByAuthor(author);
				break;
			}

			case 3: {
				System.out.println("Enter the book's title : ");
				Scanner sc2 = new Scanner(System.in);
				String title = sc2.nextLine();
				bs.searchByTitle(title);
				break;
			}

			case 4: {
				bs.displayAll();
				break;
			}

			case 5: {
				System.out.println("Enter the Book Id : ");
				Scanner sc1 = new Scanner(System.in);
				String bookId = sc1.next();
				bs.displayBook(bookId);
				break;
			}

			case 6: {
				System.out.println("Enter the Book Id : ");
				Scanner sc1 = new Scanner(System.in);
				String bookId = sc1.next();
				bs.updateBook(bookId);
				break;
			}

			case 7: {
				flag = false;
				break;
			}

			default: {
				System.out.println("Enter valid option");
			}

			}

		}
	}

}
