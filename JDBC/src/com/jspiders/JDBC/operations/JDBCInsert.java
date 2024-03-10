package com.jspiders.JDBC.operations;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert {
	public static void main(String[] args) throws SQLException {
		//load and register the driver
		Driver driver=new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(driver);
		
		//open connection
	    Connection connection =	DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4?user=root&password=root");
	
		//create the statements
	    Statement statement = connection.createStatement();
	    
	    //execute the statement
	    statement.execute("insert into user values(1,'dhanesh','dhanesh@gmail.com','dhanesh@123')");
	    
	    //process the result
	    System.out.println("data inserted");
	    
	    //close the connection
	    statement.close();
	    connection.close();
	    
	    //deregister the driver
	    DriverManager.deregisterDriver(driver);
	    
	    
	}

}
