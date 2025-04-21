package task4;

public class Employee {

	String name;
	int id;
	double salary;
	
	void addEmployeeDetails(String n, int i, double s) {
		name=n;
		id=i;
		salary=s;
	}
	
	void displayDetails() {
		System.out.println("Employee Name : "+name);
		System.out.println("Employee ID : "+id);
		System.out.println("Employee Salary : "+salary);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.addEmployeeDetails("Rashee", 101, 75000);
		emp.displayDetails();
	}

}
