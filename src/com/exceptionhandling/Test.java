package com.exceptionhandling;

public class Test {
	public static void main(String[] args) {
		Handling handling=new Handling();
		System.out.println("num=0");
		handling.tiMethod(0);
		System.out.println("num=1");
		handling.tiMethod(1);
		System.out.println("num=10");
		handling.tiMethod(10);
		System.out.println("num=15");
		handling.tiMethod(15);
	}
}
