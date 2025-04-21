package com.oops;
class PersonP{
	 PersonP() {
		 System.out.println("Person Object Created");
	}
}

class Student extends PersonP{
	Student(){
		System.out.println("Student Object created");
	}
}
public class Person {
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println();
		PersonP p=new PersonP();
		System.out.println();
		PersonP p1=new Student();
		System.out.println();
		PersonP p2=new Student();
		Student s2=(Student)p2;
		
		
		
		
	//	Student s1=(Student) new PersonP();
	}
}
