package com.oops.hierarchy;

class EmployeeP{
	public String name;
	public double baseSalary;
	//public EmployeeP() {}
	public EmployeeP(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}
	public void claculateAnnualSalary() {
		System.out.println(baseSalary);
	}
}

class Manager extends EmployeeP{
	private double bonus;
	private int noOfEmployeesManaged;
	public Manager(String name, double baseSalary,double bonus, int noOfEmployeesManaged) {
		super(name,baseSalary);
		this.bonus = bonus;
		this.noOfEmployeesManaged = noOfEmployeesManaged;
	}
	public void calculateManagerSalary() {
		System.out.println(baseSalary+bonus);
	}	
}
class Engineer extends EmployeeP{
	private double bonus;
	private int projectCount;
	public Engineer(String name, double baseSalary,double bonus,int projectCount) {
		super(name,baseSalary);
		this.bonus=bonus;
		this.projectCount = projectCount;
	}
	public void calculateEngineerSalary() {
		System.out.println(baseSalary+(bonus*projectCount));
	}
}

class SalesPerson extends EmployeeP{
	private double commisionRate;
	private int totalSales;	
	public SalesPerson(String name, double baseSalary,double commisionRate, int totalSales) {
		super(name,baseSalary);
		this.commisionRate = commisionRate;
		this.totalSales = totalSales;
	}
	public void calculateSalesSalary() {
		System.out.println(baseSalary+(commisionRate*totalSales));
	}
}
public class Employee {
	public static void main(String[] args) {
		System.out.println("****Manager****");
	EmployeeP m=new Manager("Alice",50000,10000,5);
	m.claculateAnnualSalary();
	((Manager)m).calculateManagerSalary();
	
	System.out.println("****Engineer****");
	EmployeeP e=new Engineer("Bob",70000,1000,5);
	e.claculateAnnualSalary();
	((Engineer)e).calculateEngineerSalary();
	
	System.out.println("****SalesPerson****");
	EmployeeP s=new SalesPerson("Charlie",40000,0.1,200000);
	s.claculateAnnualSalary();
	((SalesPerson)s).calculateSalesSalary();
}
}
