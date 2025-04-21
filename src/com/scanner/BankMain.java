package com.scanner;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankApplication obj=new BankApplication("Rashee","KPHB",987653211,50000);
		obj.getBalance();
		obj.deposit(1000);
		obj.getBalance();
		obj.withdraw(2000);
		obj.getBalance();
		System.out.println("-------------------------------------------------->");

		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("**** Select an option from Below ****");
		System.out.println("1. withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Show Balance");
		System.out.println("4. Exit");
		System.out.println("Enter your option [1-4]:");
		int op=sc.nextInt();
		switch(op) {
		case 1:{
			obj.withdraw(5000);
			obj.showBalance();
			break;
		}
		case 2:{
			obj.deposit(5000);
			obj.showBalance();
			break;	
		}
		case 3: obj.showBalance();
				break;
		case 4:{
			System.out.println("Thank You!");
			sc.close();
			return ;
		}
		default: {
			System.out.println("Invalid Option");
			
			}
		}	
		}
		
	}

}
