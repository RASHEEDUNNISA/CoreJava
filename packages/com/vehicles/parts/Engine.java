package com.vehicles.parts;

public class Engine {
	private String engineType;
	private int horsepower;
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public int getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	
	public void showEngineDetails() {
		System.out.println("Engine Type"+engineType);
		System.out.println("Horse Power "+horsepower);
	}
	
}
