package com.vehicle.app;
import com.vehicles.parts.*;
import com.vehicl.*;
public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		Engine e=new Engine();
		
		c.setBrand("Audi");
		c.setModel("Q1");
		c.setPrice(2500000);
		
		e.setEngineType("w12");
		e.setHorsepower(50);
		
		c.showCarDetails();
		System.out.println();
		e.showEngineDetails();
		
	}

}
