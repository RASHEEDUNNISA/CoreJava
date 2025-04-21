package com.oops.hierarchy;

class StudentP{
	public String name,studentId;
	//public StudentP() {}
	public StudentP(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
	}
	public void displayStudentInfo() {
		System.out.println("Name: "+name+" Id: "+studentId);
	}
}
class Undergraduate extends StudentP{
	private String major;
	public Undergraduate(String name, String studentId, String major) {
		super(name, studentId);
		this.major = major;
	}
	public void displayUndergraduateInfo() {
		System.out.println("Major: "+major);
	}
}
class Graduate extends StudentP{
	private String thesisTopic;
	public Graduate(String name, String studentId, String thesisTopic) {
		super(name, studentId);
		this.thesisTopic = thesisTopic;
	}
	public void displaygraduateInfo() {
		System.out.println("Thesis Topic: "+thesisTopic);
	}
}
class PhDStudent extends StudentP{
	private String researchArea;
	public PhDStudent(String name, String studentId, String researchArea) {
		super(name, studentId);
		this.researchArea = researchArea;
	}
	public void displayPhDStudentInfo() {
		System.out.println("Research Area: "+researchArea);
	}
}
public class Student {
	public static void main(String[] args) {
		System.out.println("-------UG---------");
		StudentP ug=new Undergraduate("Alice","Q1","CSE");
		ug.displayStudentInfo();
		((Undergraduate)ug).displayUndergraduateInfo();
		System.out.println("-------Graduate---------");
		StudentP g=new Graduate("Bob","Q1","ML");
		g.displayStudentInfo();
		((Graduate)g).displaygraduateInfo();
		System.out.println("-------PhD Student---------");
		StudentP phd=new PhDStudent("Charlie","Q1","Ai");
		phd.displayStudentInfo();
		((PhDStudent)phd).displayPhDStudentInfo();

	}

}
