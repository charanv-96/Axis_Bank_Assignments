package com.table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "Charanv@96");

		Statement statement = connection.createStatement();

		String sql = "CREATE TABLE PRODUCTS " + "(PROD_CODE INT PRIMARY KEY, " + " PROD_NAME VARCHAR(40), "
				+ " PROD_PRICE DOUBLE, " + " PROD_CATG VARCHAR(15)) ";

		statement.executeUpdate(sql);

		sql = "INSERT INTO PRODUCTS " + "VALUES (101, 'Laptop', 40000, 'Electronics')";
		statement.executeUpdate(sql);
		sql = "INSERT INTO PRODUCTS " + "VALUES (102, 'Keyboard', 500, 'Electronics')";
		statement.executeUpdate(sql);
		sql = "INSERT INTO PRODUCTS " + "VALUES (103, 'Mouse', 350, 'Electronics')";
		statement.executeUpdate(sql);
		sql = "INSERT INTO PRODUCTS " + "VALUES(104, 'T-Shirt', 900, 'Clothing')";
		statement.executeUpdate(sql);
		sql = "INSERT INTO PRODUCTS " + "VALUES(105, 'Jeans', 1500, 'Clothing')";
		statement.executeUpdate(sql);

		connection.close();

	}

}
