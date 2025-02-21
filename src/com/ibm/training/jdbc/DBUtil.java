package com.ibm.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static void main(String[] args) throws SQLException {
		Connection c = getConnection();
		System.out.println(c.getMetaData().getDatabaseProductName());

	}

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/ibm_feb25", "root", "secret");
	}

}
