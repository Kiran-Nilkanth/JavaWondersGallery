package com.jspiders.JDBC.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCInsert4 {
	private static PreparedStatement preparedStatement;
	private static Connection connection;
	private static String query;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter student Id");
		int id=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Student name");
		String name=scanner.nextLine();
		System.out.println("Enter Student email");
		String email=scanner.nextLine();
		System.out.println("Enter Student age");
		String age=scanner.nextLine();
		scanner.close();
		try {
			openConnection();
			query="insert into student values(?,?,?,?)";
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1,id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, email);
			preparedStatement.setString(4, age);
			int res=preparedStatement.executeUpdate();
			System.out.println(res+"row(s) affected");
			
			
		} catch (Exception e) {
			// TODO: handle exception
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
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4?","root","root");
		
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
