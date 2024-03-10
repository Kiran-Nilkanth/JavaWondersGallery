package com.jspiders.JDBC.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCInsert3 {
	private static Connection connection;
	private static PreparedStatement preaPreparedStatement;
	private static String query;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter user id ");
		int id= scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter user name");
		String name= scanner.nextLine();
		System.out.println("Enter user email");
		String email= scanner.nextLine();
		System.out.println("Enter user password");
		String password= scanner.nextLine();
		scanner.close();
		try {
			openConnection();
			query="insert into user values(?,?,?,?)";
			preaPreparedStatement=connection.prepareStatement(query);
			preaPreparedStatement.setInt(1,id);
			preaPreparedStatement.setString(2, name);
			preaPreparedStatement.setString(3, email);
			preaPreparedStatement.setString(4, password);
			int res=preaPreparedStatement.executeUpdate();
			System.out.println(res+"row(s) affected");
			
		} catch (Exception e) {
			// TODO: handle exception
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
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4?", "root", "root");
		
	}
	private static void closeConnection() throws SQLException {
		if (preaPreparedStatement!=null) {
			preaPreparedStatement.close();
			
		}
		if (connection!=null) {
			connection.close();
			
		}
		
	}

}
