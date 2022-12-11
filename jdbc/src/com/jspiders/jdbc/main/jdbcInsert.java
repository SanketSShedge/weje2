package com.jspiders.jdbc.main;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcInsert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2?user=root&password=root");
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate("insert into student values(3,'Babita','babita@iyer.com')");
			System.out.println(result+" row(s) affected.");
			
			connection.close();
			statement.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
