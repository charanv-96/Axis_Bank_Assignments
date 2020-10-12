package assignment3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductsDemo3 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		System.out.println("Enter number of Products");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		ArrayList<Product> products = new ArrayList<Product>();

		for (int i = 1; i <= num; i++) {

			System.out.println("Enter details for product " + i);
			Scanner sc1 = new Scanner(System.in);
			String s = sc1.nextLine();

			String[] s1 = s.split(" ");

			Product p1 = new Product(Integer.parseInt(s1[0]), s1[1], Double.parseDouble(s1[2]), s1[3]);

			products.add(p1);

		}

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "Charanv@96");

		for (Product p : products) {

			String sql_insert = "INSERT INTO PRODUCTS " + "VALUES (?, ?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(sql_insert);
			ps.setInt(1, p.getProdCode());
			ps.setString(2, p.getProdName());
			ps.setDouble(3, p.getProdPrice());
			ps.setString(4, p.getProdCategory());
			
			ps.executeUpdate();

		}
		System.out.println("All products inserted");

		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery("SELECT * FROM PRODUCTS");

		while (resultSet.next()) {
			System.out.println(resultSet.getString("PROD_CODE") + "\t" + resultSet.getString("PROD_NAME") + "\t"
					+ resultSet.getString("PROD_PRICE") + "\t" + resultSet.getString("PROD_CATG"));
		}

	}

}
