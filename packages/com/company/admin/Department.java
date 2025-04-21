package com.company.admin;

public class Department {
	private String deptName;
	private int deptId;
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	public void showDeptDetails() {
		System.out.println("Department ID "+deptId);
		System.out.println("Department Name "+deptName);
	}
}
