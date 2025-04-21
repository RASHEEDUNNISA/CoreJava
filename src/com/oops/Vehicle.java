package com.oops;

class VehicleP{
	void run() {
		System.out.println("Vehicle is running");
	}
}

class Car extends VehicleP{
	void run() {
		System.out.println("Car is running");
	}
	void speed() {
		System.out.println("Car is moving at 80 km/h");
	}
}
public class Vehicle {

	public static void main(String[] args) {
		VehicleP obj=new Car();
		obj.run();
	}

}
