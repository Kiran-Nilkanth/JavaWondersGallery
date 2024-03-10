package com.jspiders.JDBC.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDelet {
	private static Connection connection;
	private static Statement statement;
	private static String query;
	
	public static void main(String[] args) {
		try {
			openConnection();
			statement=connection.createStatement();
			query="delete from user where id=3";
			int res=statement.executeUpdate(query);
			System.out.println("user deleted");
			System.out.println(res);
			
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
		// TODO Auto-generated method stub
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4?","root","root");
		
		
	}

	private static void closeConnection() throws SQLException {
		// TODO Auto-generated method stub
		if (statement!=null) {
			statement.close();
			
		}
		if (connection!=null) {
			connection.close();
			
		}
		
	}

}
