package com.arrays;
import java.util.Arrays;
public class Patient {

	private int patientId;
	private String name;
	private double[] testResult;
	public Patient(int patientId,String name,double[] testResult) {
		this.patientId=patientId;
		this.name=name;
		this.testResult=testResult;
	}
	public double getAverageResult() {
		double res=0;
		for(double d:testResult)
			res+=d;
		return (res/testResult.length);
	}
	public boolean hasCriticalValues() {
		for(double d: testResult) {
			if(d<50)
				return true;
		}
		return false;
	}
	public void displayPatientReport() {
		System.out.println("Patient ID : "+patientId);
		System.out.println("Name : "+name);
		System.out.println("Test Results : "+Arrays.toString(testResult));
	}
	public static void main(String[] args) {
		Patient p1=new Patient(101,"Rajesh",new double[]{80,200,300,205,150});
		Patient p2=new Patient(102,"Sakesh",new double[]{10,5,43,50,5});
		Patient p3=new Patient(103,"Ramesh",new double[]{100,200,315,524,150});
		Patient p4=new Patient(104,"Satish",new double[]{101,105,116,109,50});
		Patient p5=new Patient(105,"Murali",new double[]{8,4,3,25,15});
		for(Patient p:new Patient[]{p1,p2,p3,p4,p5}) {
			p.displayPatientReport();
			System.out.println("Average Result "+p.getAverageResult());
			System.out.println("Has Critical values "+p.hasCriticalValues());
		}
		System.out.println("------------------------------------------------------------");
		for(Patient p:new Patient[]{p1,p2,p3,p4,p5}) {
			if(p.hasCriticalValues())
			p.displayPatientReport();
			
		}
		
	}

}
