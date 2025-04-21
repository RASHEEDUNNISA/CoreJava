package com.polymorphism;

class VehicleP{
	void start() {
		System.out.println("Vehicle started");
	}
}
class Car extends VehicleP{
	@Override
	void start() {
		System.out.println("Car Started");
	}
}
public class Vehicle {

	public static void main(String[] args) {
		VehicleP vp=new VehicleP();
		vp.start();
		Car c=new Car();
		c.start();

	}

}
