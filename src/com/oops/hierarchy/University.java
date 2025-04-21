package com.oops.hierarchy;
abstract class EmployeePP{
	private String employeeId,name;
	public EmployeePP(String employeeId, String name) {
		super();
		this.employeeId = employeeId;
		this.name = name;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract double calculateSalary();
	public abstract void displayDetails();
	protected void printBasicInfo() {
		System.out.println("Id: "+getEmployeeId());
		System.out.println("Name: "+getName());
	}
}
class FacultyMember extends EmployeePP{
	private int departmentCode,yearsOfService;
	public FacultyMember(String employeeId, String name, int departmentCode, int yearsOfService) {
		super(employeeId, name);
		this.departmentCode = departmentCode;
		this.yearsOfService = yearsOfService;
	}
	public int getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(int departmentCode) {
		this.departmentCode = departmentCode;
	}

	public int getYearsOfService() {
		return yearsOfService;
	}
	public void setYearsOfService(int yearsOfService) {
		this.yearsOfService = yearsOfService;
	}
	@Override
	public double calculateSalary() {
		double baseSalary=50000;
		double bonus=1000;
		return (baseSalary+(yearsOfService*bonus));
	}
	@Override
	public void displayDetails() {
		printBasicInfo();
		System.out.println("Department Code: "+getDepartmentCode());
		System.out.println("Years of Service: "+getYearsOfService());
	}
}
class StaffMember extends EmployeePP{
	private String designation;
	private double overtimeHours;
	public StaffMember(String employeeId, String name, String designation, double overtimeHours) {
		super(employeeId, name);
		this.designation = designation;
		this.overtimeHours = overtimeHours;
	}
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	@Override
	public double calculateSalary() {
		double base=40000;
		double overtime=25;
		return(base+(overtime*overtimeHours));
	}
	@Override
	public void displayDetails() {
		printBasicInfo();
		System.out.println("Designation: "+getDesignation());
		System.out.println("Over time Hours: "+getOvertimeHours());
	}
}
public class University {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Employee Details: ");
//		EmployeePP fm=new FacultyMember("f1001","Smith",101,5);
//		fm.displayDetails();
//		System.out.println("Monthly Salary: "+fm.calculateSalary());
//		System.out.println("Employee Details: ");
//		EmployeePP sm=new StaffMember("s1001","Jane Doe","Administrator",5);
//		sm.displayDetails();
//		System.out.println("Monthly Salary: "+sm.calculateSalary());
		EmployeePP[] obj=new EmployeePP[2];
		for(int i=0;i<1;i++) {
			obj[i]=new FacultyMember("f1001","Smith",101,5);
			obj[i].displayDetails();
			System.out.println("Monthly Salary: "+obj[i].calculateSalary());
			System.out.println("Employee Details: ");
			obj[i]=new StaffMember("s1001","Jane Doe","Administrator",5);
			obj[i].displayDetails();
			System.out.println("Monthly Salary: "+obj[i].calculateSalary());
		}
		
	}
}
