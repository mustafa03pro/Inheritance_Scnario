package com.may28.multilevel;

public class Vehicle {
	protected String make;
	protected String model;
	protected int year;
	public Vehicle(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public void displayDetails() {
		System.out.println(make);
		System.out.println(model);
		System.out.println(year);
	}

}
class Car extends Vehicle{
	protected int numberOfDoors;

	public Car(String make, String model, int year, int numberOfDoors) {
		super(make, model, year);
		this.numberOfDoors = numberOfDoors;
	}
	public void displayDetails() {
		System.out.println("Car numberOfDoors=" + numberOfDoors + "\n make=" + make + "\n model=" + model + "\n year=" + year );
		
	}
	
	
}
class Bike extends Vehicle{
	protected String type;

	public Bike(String make, String model, int year, String type) {
		super(make, model, year);
		this.type = type;
		if(make=="") {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
	}
	public void displayDetails() {
		System.out.println("Bike type=" + type + "\n make=" + make + "\n model=" + model + "\n year=" + year );
		
	}
	
	
	
}
