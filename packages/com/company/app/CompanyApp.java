package com.company.app;
import com.company.admin.Department;
import com.company.hr.Employee;
public class CompanyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d=new Department();
		Employee e=new Employee();
		
		e.setId(1);
		e.setName("XYZ");
		e.setSalary(75000);
		
		d.setDeptId(101);
		d.setDeptName("CSE");
		
		e.showEmployeeDetails();
		System.out.println();
		d.showDeptDetails();
	}

}
