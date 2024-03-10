package com.jspiders.CarProjectJDBC.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteCar {
	private static PreparedStatement preparedStatement;
	private static Connection connection;
	private static String query;
	
	public static void deleteCar() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Car id to delete record:");
		int id=scanner.nextInt();
		
		try {
			openConnection();
			query="delete from car where id=? ";
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			int res=preparedStatement.executeUpdate();
			System.out.println(res+ "Car Deleted...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
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
	}

}
