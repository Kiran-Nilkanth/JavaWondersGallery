package com.jspiders.CarProjectJDBC.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateCar {
	private static PreparedStatement preparedStatement;
	private static Connection connection;
	private static String query;
	public static void updateCar() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Car Id:");
		int id=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter new car Price:");
		String price=scanner.nextLine();
		
		try {
			openConnection();
			query="update car set price=? where id=?";
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(2, id);
			preparedStatement.setString(1, price);
			int res=preparedStatement.executeUpdate();
			if (res==1) {
				System.out.println("Price Updated");
				
			}else {
				System.out.println("car not found");
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
		if (connection!=null) {
			connection.close();
			
		}
	}


}
