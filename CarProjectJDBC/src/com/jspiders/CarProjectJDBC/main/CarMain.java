package com.jspiders.CarProjectJDBC.main;

import java.util.Scanner;

import com.jspiders.CarProjectJDBC.operations.DeleteCar;
import com.jspiders.CarProjectJDBC.operations.DisplayCars;
import com.jspiders.CarProjectJDBC.operations.InsertDetail;
import com.jspiders.CarProjectJDBC.operations.SearchCar;
import com.jspiders.CarProjectJDBC.operations.UpdateCar;

public class CarMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println(
					"Enter 1 to add a car\nEnter 2 to search car by id\nEnter 3 to display all cars\nEnter 4 to delete a car\nEnter 5 to update car price\nEnter 6 to exit");
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				InsertDetail.addCar();
				break;
			case 2:
				SearchCar.searchCar();
				break;
			case 3:
				DisplayCars.displayCar();
				break;
			case 4:
				DeleteCar.deleteCar();
				break;
			case 5:
				UpdateCar.updateCar();
				break;
			case 6:
				flag = false;
				System.out.println("Thank You");
				break;
			default:
				System.out.println("Invalid choice");
			}
		}

	}

}
