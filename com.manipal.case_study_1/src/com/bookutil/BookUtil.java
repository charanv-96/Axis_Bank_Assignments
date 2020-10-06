package com.bookutil;

import com.book.*;

public class BookUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookStore bs = new BookStore();

		Book b1 = new Book("B100", "A book", "Charan", "Fiction", 222);

		Book b2 = new Book("B101", "A book too", "Someone", "Science", 908);

		Book b3 = new Book("B102", "A book as well", "Charan", "Others", 22);

		bs.addBook(b1);
		bs.addBook(b2);
		bs.addBook(b3);

		System.out.println("-----------");

		bs.searchByAuthor("Charan");

		System.out.println("-----------");

		bs.searchByTitle("A book");

		System.out.println("-----------");

		bs.displayAll();

		System.out.println("-----------");

		bs.updateBook("B101");

		System.out.println("-----------");

		bs.displayBook("B101");

		System.out.println("-----------");

	}

}
