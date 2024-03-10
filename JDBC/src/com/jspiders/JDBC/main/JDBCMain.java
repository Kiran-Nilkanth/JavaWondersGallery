package com.jspiders.JDBC.main;

import java.util.Scanner;

import com.jspiders.JDBC.operations.JDBCService;

public class JDBCMain {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1 to Sign up /n Enter 2 to Log in /n Enter 3 to Exit");
		int choice=scanner.nextInt();
		switch (choice) {
		case 1:
			JDBCService.signUp(scanner);
			break;
		case 2:
			JDBCService.logIn(scanner);
			break;
		case 3:
			System.out.println("Thank you");
			break;

		default:
			System.out.println("Invalid choice ");
			break;
		}
		
	}

}
