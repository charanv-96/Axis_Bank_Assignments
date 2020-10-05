package assignment_3;

public class Product {

	private String productCode;
	private String productName;
	private double productPrice;

	Product(String productCode, String productName, double productPrice) {
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public void displayProductDetails() {

		System.out.println("Product Code : " + productCode);
		System.out.println("Product Name : " + productName);
		System.out.println("Product Price : " + productPrice);

	}

}
