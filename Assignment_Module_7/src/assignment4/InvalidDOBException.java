package assignment4;

public class InvalidDOBException extends Exception {

	public InvalidDOBException() {

	}

	@Override
	public String getMessage() {
		return "Date of Birth is past current date";
	}

}