package com.oops.hierarchy;
class ShapeP{
	public ShapeP() {}
	public void calculateArea() {
		System.out.println("Calculate the area");
	}
}
class Circle extends ShapeP{
	private double radius;
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public void calculateCircleArea() {
		System.out.println(Math.PI*radius*radius);
	}
}
class Rectangle extends ShapeP{
	private double length,width;
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	public void calculateRectangleArea() {
		System.out.println(length*width);
	}
}
class Triangle extends ShapeP{
	private double base,height;

	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	public void calculateTriangleArea() {
		System.out.println(base*height);
	}
}
public class Shape {
	public static void main(String[] args) {
		System.out.println("***Circle***");
		ShapeP c=new Circle(7);
		c.calculateArea();
		((Circle)c).calculateCircleArea();
		System.out.println("****Rectangle****");
		ShapeP r=new Rectangle(2,5);
		r.calculateArea();
		((Rectangle)r).calculateRectangleArea();
		System.out.println("****Triangle****");
		ShapeP t=new Triangle(2,3);
		t.calculateArea();
		((Triangle)t).calculateTriangleArea();
	}
}
