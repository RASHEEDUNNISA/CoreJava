package com.oops;

class AnimalP {
	void display() {
		System.out.println("This is animal");
	}
}

class Dog extends AnimalP{
	void display() {
		System.out.println("This is Dog");
	}
}

public class Animal{
	public static void main(String[] args) {
		AnimalP obj=new Dog();
		obj.display();
	}
}