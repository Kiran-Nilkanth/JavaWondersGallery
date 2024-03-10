package com.jspiders.JDBC.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCSelect5 {
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	private static String query;
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter User id:");
		int id=scanner.nextInt();
		scanner.close();
		try {
			openConnection();
			query="select * from user where id=?";
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1,id);
			resultSet=preparedStatement.executeQuery();
			if (resultSet.next()) {
				System.out.println("Id:" +resultSet.getInt(1));
				System.out.println("Name:"+ resultSet.getString(2));
				System.out.println("Email:"+ resultSet.getString(3));
				System.out.println("Password:"+ resultSet.getString(4));
				
			}else {
				
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
		if (resultSet!=null) {
			resultSet.close();
		}
		if (connection!=null) {
			connection.close();
			
		}
		if (preparedStatement!=null) {
			preparedStatement.close();
			
		}
		
	}

}
