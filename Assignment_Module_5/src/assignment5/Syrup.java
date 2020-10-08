package assignment5;

import java.util.Date;

public class Syrup extends Medicine {

	Syrup(float price, String expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	String displayLabel() {
		// TODO Auto-generated method stub
		return "Shake before use";
	}

}
