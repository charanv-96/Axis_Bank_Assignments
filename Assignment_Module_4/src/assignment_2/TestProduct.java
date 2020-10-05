package assignment_2;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p2 = new Product();

		p2.setProductCode("P102");
		p2.setProductName("Mobile");
		p2.setProductPrice(20000.00);

		System.out.println("Product Code : " + p2.getProductCode());
		System.out.println("Product Name : " + p2.getProductName());
		System.out.println("Product Price : " + p2.getProductPrice());

	}

}
