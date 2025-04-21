package com.polymorphism;
class ParentP{
	static void print() {
		System.out.println("Print");
	}
}
class Child extends ParentP{
	static void print() {
		System.out.println("Child");
	}
}
public class Parent {
public static void main(String[] args) {
	ParentP pp=new ParentP();
	pp.print();
	ParentP.print();
	Child c=new Child();
	c.print();
	Child.print();
}
}
