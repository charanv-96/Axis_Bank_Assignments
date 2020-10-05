package Assignment_5;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1 = new Product("Laptop", 45000.00, 'A');

		System.out.println(p1.getProductDetails());

		Product p2 = new Product("Mobile", 85000.00);

		System.out.println(p2.getProductDetails());

	}

}
