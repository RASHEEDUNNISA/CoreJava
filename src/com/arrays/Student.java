package com.arrays;

class Course {
	String courseName;
	int[] marks;
	public Course(String courseName,int[] marks) {
		this.courseName=courseName;
		this.marks=marks;
	}
}
public class Student{
	int roll;
	String name;
	Course[] course;
	public Student(int roll,String name,Course[] course) {
		this.roll=roll;
		this.name=name;
		this.course=course;
	}
	public double getAverage(int[] marks) {
		double average=0;
		for(int i:marks) {
			average+=i;
		}
		average=average/(marks).length;
		return average;	
		}
	public void getOverallAverage() {
		double overallAverage=0;
				//average=0;
		for(int i=0;i<course.length;i++) {
//			for(int j=0;j<((course[i].marks).length);j++) {
				overallAverage+=getAverage(course[i].marks);
		//	}
			//average=average/(course[i].marks).length;
		}
		System.out.println("Average Marks of all courses :"+overallAverage/course.length);
	}
	public void displayStudentPerformance() {
		System.out.println("Student Name :"+name+"\n");
		 System.out.println("--------Course-wise marks---------");
		 for(int i=0;i<course.length;i++)
		System.out.println("Average of Each Course "+getAverage(course[i].marks));
		getOverallAverage();
	}
	public static void main(String[] args) {
		Course c1=new Course("AIML",new int[] {60,70,80,90});
		Course c2=new Course("CSE",new int[] {60,70,80,75});
		Course c3=new Course("AIDS",new int[] {65,70,80,85});
		Course c4=new Course("MECH",new int[] {50,60,75,90});
		Course c5=new Course("CIVIL",new int[] {64,72,60,71});
		Course c6=new Course("ECE",new int[] {60,70,80,85});
		Student s1=new Student(1,"Rashee",new Course[] {c1,c2,c3});
		//System.out.println("--------Course-wise marks---------");
		System.out.println("--------------------Student 1 details------------");
		s1.displayStudentPerformance();
		System.out.println("--------------------Student 2 details------------");
		Student s2=new Student(2,"Ammu",new Course[] {c4,c5,c6});
		s2.displayStudentPerformance();
	}
}
