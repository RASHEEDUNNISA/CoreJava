package com.polymorphism;
class ShapeP{
	void draw() {
		System.out.println("Drawing Shape");
	}
}
class Circle extends ShapeP{
	void draw() {
		System.out.println("Drawing Circle");
	}
}
class Square extends ShapeP{
	void draw() {
		System.out.println("Drawing Square");
	}
}
public class Shape {
public static void main(String[] args) {
	ShapeP[] obj=new ShapeP[2];
	obj[0]=new Circle();
	obj[1]=new Square();
	obj[0].draw();
	obj[1].draw();
	}
}
