package com.book;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Book {

	private String bookId;
	private String title;
	private String author;
	private String category;
	private float price;
	private int flag = 1;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {

		this.category = category;

	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {

		this.price = price;

	}

	public Book(String bookId, String title, String author, String category, float price) {

		if (category == "Science" || category == "Fiction" || category == "Technology" || category == "Others") {

			flag = 1;

		} else {
			System.out.println("Please enter valid category");
			flag = 0;
			System.exit(0);
		}

		if (price < 0) {
			System.out.println("Please enter valid price");
			flag = 0;
			System.exit(0);
		} else {
			flag = 1;

		}

		Pattern pattern = Pattern.compile("B...");
		Matcher matcher = pattern.matcher(bookId);
		boolean matchFound = matcher.find();

		if (matchFound) {
			flag = 1;
		} else {
			System.out.println("Please enter valid Book Id");
			flag = 0;
			System.exit(0);
		}

		if (flag == 1) {

			this.author = author;
			this.bookId = bookId;
			this.category = category;
			this.price = price;
			this.title = title;

		}

	}

}
