package com.vehicl;

public class Car {
	private String brand;
	private String model;
	private double price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void showCarDetails() {
		System.out.println("Brand "+brand);
		System.out.println("Model "+model);
		System.out.println("Price "+price);
	}
}
