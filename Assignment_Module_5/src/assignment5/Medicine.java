package assignment5;

import java.util.Date;

public abstract class Medicine {

	private float price;
	private String expiryDate;

	Medicine(float price, String expiryDate) {

		this.expiryDate = expiryDate;
		this.price = price;

	}

	public String getDetails() {

		return "Price : " + price + "\n" + "Expiry Date : " + expiryDate;

	}

	abstract String displayLabel();

}
