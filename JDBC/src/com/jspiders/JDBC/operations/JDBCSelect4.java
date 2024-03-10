package com.jspiders.JDBC.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelect4 {
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static String query;
	
	public static void main(String[] args) {
		try {
			openConnection();
			statement=connection.createStatement();
			query="select * from student where name like '%jay%' ";
			resultSet=statement.executeQuery(query);
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getString(4));
				
				
			}
			
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
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4?","root","root");
		
	}
	private static void closeConnection() throws SQLException {
		if (statement!=null) {
			statement.close();
			
		}
		if (connection!=null) {
			connection.close();
			
		}
	}

}
