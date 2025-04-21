package com.oops;

class EmployeeP{
	double salary=50000;
}

class Manager extends EmployeeP{
	double bonus=20000;
}
public class Employee {
	public static void main(String[] args) {
		Manager emp=new Manager();
		System.out.println(emp.salary+emp.bonus);
	}
}
