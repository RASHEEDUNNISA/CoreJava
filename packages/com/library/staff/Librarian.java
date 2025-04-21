package com.library.staff;

public class Librarian {
	private String librarianName;
	private int yearOfExperience;
	public String getLibrarianName() {
		return librarianName;
	}
	public void setLibrarianName(String librarianName) {
		this.librarianName = librarianName;
	}
	public int getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	
	public void showsLibrarianDetails() {
		System.out.println("Librarian Name "+librarianName);
		System.out.println("Year of Experience "+yearOfExperience);
	}
}
