package Assignment_5;

public class Product {

	private String productCode;
	private String productName;
	private double productPrice;
	private char categoryCode;

	private static int prodCounter = 100;

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void categoryCode(char categoryCode) {
		this.categoryCode = categoryCode;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public String getProductName() {
		return this.productName;
	}

	public double getProductPrice() {
		return this.productPrice;
	}

	public char categoryCode() {
		return this.categoryCode;
	}

	private String generateProductCode(char categoryCode) {

		String result = "";

		result = categoryCode + Integer.toString(prodCounter);

		prodCounter++;

		return result;
	}

	Product(String productName, double productPrice, char categoryCode) {

		this.categoryCode = categoryCode;

		this.productCode = generateProductCode(this.categoryCode);

		this.productName = productName;

		this.productPrice = productPrice;

	}

	Product(String productName, double productPrice) {

		this.categoryCode = 'E';

		this.productCode = generateProductCode('E');

		this.productName = productName;

		this.productPrice = productPrice;

	}

	public String getProductDetails() {

		return ("Product : Code --" + prodCounter + ", Name -- " + this.productName + ", price - " + this.productPrice
				+ ", Category -- " + this.categoryCode + " " + this.productCode);
	}

}
