package com.polymorphism;

class AnimalP{
	void  makeSound() {
		System.out.println("Animal Sound");
	}
}
class Dog extends AnimalP{
	@Override
	void makeSound() {
		System.out.println("Bark");
	}
}
public class Animal {
	public static void main(String[] args) {
		AnimalP obj=new AnimalP();
		Dog d=new Dog();
		obj.makeSound();
		d.makeSound();
	}
}
