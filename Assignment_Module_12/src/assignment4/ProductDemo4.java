package assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDemo4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "Charanv@96");

		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE);

		ResultSet resultSet = statement.executeQuery("SELECT * FROM PRODUCTS");

		while (resultSet.next()) {

			if (resultSet.getString("PROD_CATG").equals("Electronics")) {
				if (resultSet.getInt("PROD_PRICE") < 1000) {
					int price = resultSet.getInt("PROD_PRICE");
					price += price * 0.1;
					resultSet.updateInt("PROD_PRICE", price);
					resultSet.updateRow();
				}
			}

			if (resultSet.getString("PROD_CATG").equals("Clothing")) {
				if (resultSet.getInt("PROD_PRICE") > 1000) {
					int price = resultSet.getInt("PROD_PRICE");
					price -= price * 0.1;
					resultSet.updateInt("PROD_PRICE", price);
					resultSet.updateRow();
				}
			}

		}

		while (resultSet.next()) {
			System.out.println(resultSet.getString("PROD_CODE") + "\t" + resultSet.getString("PROD_NAME") + "\t"
					+ resultSet.getString("PROD_PRICE") + "\t" + resultSet.getString("PROD_CATG"));
		}

		connection.close();

	}

}
