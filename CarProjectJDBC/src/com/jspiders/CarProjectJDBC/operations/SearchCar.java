package com.jspiders.CarProjectJDBC.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SearchCar {
	private static PreparedStatement preparedStatement;
	private static Connection connection;
	private static ResultSet resultSet;
	private static String query;
	
	public static void searchCar() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Car Id:");
		int id=scanner.nextInt();
		
		try {
			openConnection();
			query="Select * from car where id=?";
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			resultSet=preparedStatement.executeQuery();
			if (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				
			}else {
				System.out.println("Car not found...");
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
		if (preparedStatement!=null) {
			preparedStatement.close();
			
		}
		if(connection!=null) {
			connection.close();
		}
		if (resultSet!=null) {
			resultSet.close();
			
		}
	}

}
