package assignment5;

import java.util.Date;

public class Ointment extends Medicine {

	Ointment(float price, String expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	String displayLabel() {
		// TODO Auto-generated method stub
		return "For external use only";
	}

}
