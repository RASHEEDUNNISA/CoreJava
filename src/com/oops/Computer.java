package com.oops;

class ComputerP{
	void showBrand() {
		System.out.println("Brand : Dell");
	}
}

class Laptop extends ComputerP{
	void showModel() {
		System.out.println("Mdeol : XPS15");
	}
}
public class Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l=new Laptop();
		l.showBrand();
		l.showModel();
	}

}
