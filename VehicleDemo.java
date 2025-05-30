package com.may28.multilevel;

import java.util.Scanner;

public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello");
		Scanner sc=new Scanner(System.in);
		String make = sc.nextLine();
		String model=sc.nextLine();
		int year =Integer.parseInt(sc.nextLine());
		int numberOfDoors=Integer.parseInt(sc.nextLine());
		
		
		Car car = new Car(make, model, year, numberOfDoors);
        System.out.println("Car Details:");
        car.displayDetails();
        String make1 = sc.nextLine();
		String model1=sc.nextLine();
		int year1 =Integer.parseInt(sc.nextLine());
		String type=sc.nextLine();

        Bike bike = new Bike(make1, model1, year1, type);
        System.out.println("\nBike Details:");
        bike.displayDetails();
        sc.close();

	}
	

}
