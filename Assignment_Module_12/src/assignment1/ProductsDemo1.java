package assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductsDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "Charanv@96");

		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery("SELECT * FROM PRODUCTS");
		
		while (resultSet.next()) {
			System.out.println(resultSet.getString("PROD_CODE") + "\t" + resultSet.getString("PROD_NAME")+ "\t" 
		+ resultSet.getString("PROD_PRICE")+ "\t" + resultSet.getString("PROD_CATG"));
		}

		connection.close();

	}

}
