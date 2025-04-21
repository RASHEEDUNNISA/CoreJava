package com.polymorphism;

class PersonP{
	protected void display() {
		System.out.println("I am a Person");
	}
}
class Student extends PersonP{
	public void display() {
		System.out.println("I am a Student");
	}
}
public class Person {

	public static void main(String[] args) {
		Student s=new Student();
		PersonP pp=new Student();
		Student s1=(Student)pp;
		s1.display();
		s.display();

	}

}
