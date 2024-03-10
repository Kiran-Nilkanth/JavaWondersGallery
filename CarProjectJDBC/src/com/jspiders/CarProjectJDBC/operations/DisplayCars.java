package com.jspiders.CarProjectJDBC.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayCars {
	private static Statement statement;
	private static Connection connection;
	private static ResultSet resultSet;
	private static String query;
	
	public static void displayCar() {
		try {
			openConnection();
			statement=connection.createStatement();
			query="Select * from car";
			resultSet=statement.executeQuery(query);
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	private static void openConnection() throws SQLException {
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4","root","root");
	}
	private static void closeConnection() throws SQLException {
		if (statement!=null) {
			statement.close();
			
		}
		if(connection!=null) {
			connection.close();
		}
		if (resultSet!=null) {
			resultSet.close();
			
		}
	}

}
