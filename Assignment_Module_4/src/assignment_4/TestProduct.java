package assignment_4;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1 = new Product();
		
		System.out.println("Product Code : " + p1.productCode);
		System.out.println("Product Name : " + p1.productName);
		System.out.println("Product Price : " + p1.productPrice);

		
		Product p2 = new Product();
		
		p2.setProductCode("P102");
		p2.setProductName("Mobile");
		p2.setProductPrice(20000.00);
		
		System.out.println("Product Code : " + p2.productCode);
		System.out.println("Product Name : " + p2.productName);
		System.out.println("Product Price : " + p2.productPrice);

	}

}
