package com.book;

public class InvalidInputException extends Exception {

	public InvalidInputException() {

	}

	@Override
	public String getMessage() {
		return "Invalid Input";
	}

}
