package com.jspiders.jdbc2.resources;

import java.io.FileReader;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcCall {
	private static Connection connection;
	private static CallableStatement callableStatement;
	private static ResultSet resultSet;
	private static Properties properties = new Properties();
	private static FileReader fileReader;
	private static String filePath = "D:\\WEJE2\\Demo\\jdbc2\\resources\\db_info.properties";
	private static String query;
	
	public static void main(String[] args) {
		try {
			fileReader = new FileReader(filePath);
			properties.load(fileReader);
			
			Class.forName(properties.getProperty("driverPath"));
			
			connection = DriverManager.getConnection(properties.getProperty("dburl"), properties);
			query = "call proc5()";
			callableStatement = connection.prepareCall(query);
			resultSet = callableStatement.executeQuery();
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1)+" | "+resultSet.getString(2)+" | "+resultSet.getString(3));
			}
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(callableStatement!=null) {
				try {
					callableStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
