package assignment5;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import assignment3.Product;

public class ProductDAO {

	public boolean insertProduct(Product p1) throws ClassNotFoundException, SQLException {

		DBUtil dbu = new DBUtil();

		String sql_insert = "INSERT INTO PRODUCTS " + "VALUES (?, ?, ?, ?)";
		PreparedStatement ps = dbu.getConnection().prepareStatement(sql_insert);
		ps.setInt(1, p1.getProdCode());
		ps.setString(2, p1.getProdName());
		ps.setDouble(3, p1.getProdPrice());
		ps.setString(4, p1.getProdCategory());

		ps.executeUpdate();

		return true;

	}

	public Product getProduct(int prodCode) throws ClassNotFoundException, SQLException {

		DBUtil dbu = new DBUtil();

		Statement statement = dbu.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_UPDATABLE);

		ResultSet resultSet = statement
				.executeQuery("SELECT * FROM PRODUCTS WHERE PROD_CODE = " + String.valueOf(prodCode));

		Product p1 = new Product();

		while (resultSet.next()) {

			p1.setProdCode(resultSet.getInt("PROD_CODE"));
			p1.setProdName(resultSet.getString("PROD_NAME"));
			p1.setProdPrice(resultSet.getDouble("PROD_PRICE"));
			p1.setProdCategory(resultSet.getString("PROD_CATG"));

		}

		return p1;

	}

}
