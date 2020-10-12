package assignment2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProductsDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		System.out.println("Enter Product Code");
		Scanner sc = new Scanner(System.in);
		int prodCode = sc.nextInt();

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "Charanv@96");

		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery("SELECT * FROM PRODUCTS WHERE PROD_CODE = " + prodCode);

		while (resultSet.next()) {
			System.out.println("Code : " + resultSet.getString("PROD_CODE") + "\n" + "Name : "
					+ resultSet.getString("PROD_NAME") + "\n" + "Price : " + resultSet.getString("PROD_PRICE") + "\n"
					+ "Category : " + resultSet.getString("PROD_CATG"));
		}

		connection.close();
		sc.close();

	}

}
