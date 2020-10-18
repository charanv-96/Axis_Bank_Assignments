package com.train.ticket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TrainDAO {

	private static String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private static String DB_URL = "jdbc:mysql://localhost:3306/newdb";
	private static String USERNAME = "root";
	private static String PASSWORD = "Charanv@96";

	public Train findTrain(int trainNo) throws ClassNotFoundException, SQLException {

		Class.forName(DRIVER_NAME);

		Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

		ResultSet resultSet = statement
				.executeQuery("SELECT * FROM TRAINS WHERE TRAIN_NO = " + String.valueOf(trainNo));

		Train t = new Train(resultSet.getInt("TRAIN_NO"), resultSet.getString("TRAIN_NAME"),
				resultSet.getString("SOURCE"), resultSet.getString("DESTINATION"), resultSet.getDouble("TICKET_PRICE"));

		return t;

	}

}
