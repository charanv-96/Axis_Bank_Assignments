package assignment5;

import java.util.Date;

public class Tablet extends Medicine {
	

	
	
	Tablet(float price, String expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayLabel() {
		return "Store in a cool and dry place.";
	}

}
