package com.school.management;

public class School {
	private String name,location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public void showSchoolInfo() {
		System.out.println("School Name "+name);
		System.out.println("Location "+location);
	}
}
