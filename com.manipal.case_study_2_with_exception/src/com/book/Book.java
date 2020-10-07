package com.book;

import java.util.InputMismatchException;
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

	public void setCategory(String category) throws InvalidInputException {

		try {
			if (category.equals("Science") || category.equals("Fiction") || category.equals("Technology")
					|| category.equals("Others")) {

				this.category = category;

			} else {
				throw new InvalidInputException();
			}
		} catch (InvalidInputException iie) {
			throw new InvalidInputException();
		}

	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) throws InvalidInputException {

		try {
			if (price < 0) {
				throw new InvalidInputException();
			} else {

				this.price = price;
			}
		} catch (InvalidInputException iie) {
			throw new InvalidInputException();
		}

	}

	public Book(String bookId, String title, String author, String category, float price) throws InvalidInputException {

		try {
			if (category.equals("Science") || category.equals("Fiction") || category.equals("Technology")
					|| category.equals("Others")) {

				flag = 1;

			} else {
				throw new InvalidInputException();
			}

			if (price < 0) {
				throw new InvalidInputException();

			} else {
				flag = 1;

			}

			Pattern pattern = Pattern.compile("B...");
			Matcher matcher = pattern.matcher(bookId);
			boolean matchFound = matcher.find();

			if (matchFound) {
				flag = 1;
			} else {
				throw new InvalidInputException();
			}

			if (flag == 1) {

				this.author = author;
				this.bookId = bookId;
				this.category = category;
				this.price = price;
				this.title = title;

			}

		} catch (InvalidInputException iie) {
			throw new InvalidInputException();
		}

	}

}
