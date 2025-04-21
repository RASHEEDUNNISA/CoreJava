package com.oops.hierarchy;

class VehicleP {
	private String brand,model;
	private int year;
	
	public VehicleP() {}
	
	public VehicleP(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public void displayInfo() {
		System.out.println("Brand: "+brand+" Model: "+model+" Year: "+year);
	}
}

class Car extends VehicleP{
	private int noOfDoors;

	public Car(String brand, String model, int year,int noOfDoors) {
		super(brand, model,year);
		this.noOfDoors = noOfDoors;
	}
	
	public void displayCarInfo() {
		System.out.println("No of Doors: "+noOfDoors);
	}
	
}

class Truck extends VehicleP{
	private int cargoCapacity;
	public Truck(String brand,String model,int year,int cargoCapacity) {
		super(brand,model,year);
		this.cargoCapacity=cargoCapacity;
	}
	
	public void displayTruckInfo() {
		System.out.println("Cargo Capacity: "+cargoCapacity);
	}
}

class MotorCycle extends VehicleP{
	private boolean hasSidecar;
	public MotorCycle(String brand,String model,int year,boolean hasSidecar) {
		super(brand,model,year);
		this.hasSidecar=hasSidecar;
	}
	public void displayMotorInfo() {
		System.out.println("Had Sidecar: "+hasSidecar);
	}
}

public class Vehicle{
	public static void main(String[] args) {
		System.out.println("---------Car---------");
		VehicleP car=new Car("Audi","Q1",2020,4);
		car.displayInfo();
		((Car)car).displayCarInfo();
		
		System.out.println("---------Truck---------");
		VehicleP truck=new Truck("abc","xyz",2020,1000);
		truck.displayInfo();
		((Truck)truck).displayTruckInfo();
		
		System.out.println("---------MotorCycle---------");
		VehicleP motor=new MotorCycle("Honda","abc",2018,false);
		motor.displayInfo();
		((MotorCycle)motor).displayMotorInfo();
		
	}
}