package assignment5;

import java.sql.SQLException;
import java.util.Scanner;

import assignment3.Product;

public class ProductDemo5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		System.out.println("Enter details for product ");
		Scanner sc1 = new Scanner(System.in);
		String s = sc1.nextLine();

		String[] s1 = s.split(" ");

		Product p1 = new Product(Integer.parseInt(s1[0]), s1[1], Double.parseDouble(s1[2]), s1[3]);

		ProductDAO pdao = new ProductDAO();

		pdao.insertProduct(p1);

		System.out.println("Enter prodcut code");
		Scanner sc2 = new Scanner(System.in);
		int prodCode = sc2.nextInt();

		Product p2 = pdao.getProduct(prodCode);

		System.out.println("Code : " + p2.getProdCode() + "\n" + "Name : " + p2.getProdName() + "\n" + "Price : "
				+ p2.getProdPrice() + "\n" + "Category : " + p2.getProdCategory());

		// sc1.close();
		sc2.close();

	}

}
