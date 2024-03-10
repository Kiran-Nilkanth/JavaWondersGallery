package com.jspiders.CarProjectJDBC.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDetail {
	private static PreparedStatement preparedStatement;
	private static Connection connection;
	private static String query;
	public static void addCar() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Car Id:");
		int id=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Car Name:");
		String name=scanner.nextLine();
		System.out.println("Enter Car Price:");
		String price=scanner.nextLine();
		
		try {
			openConnection();
			query="insert into car values(?,?,?)";
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, price);
			int res=preparedStatement.executeUpdate();
			System.out.println(res+"row(s) affected");
			
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
		if (connection!=null) {
			connection.close();
			
		}
	}

}
