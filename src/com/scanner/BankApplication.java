package com.scanner;

public class BankApplication {
	private String customerName,CustomerAddress;
	private long phoneNumber;
	private double balance;
	
	BankApplication(){}
	BankApplication(String customerName,String customerAddress,long phoneNumber,double balance){
	this.customerName=customerName;
	this.CustomerAddress=customerAddress;
	this.phoneNumber=phoneNumber;
	this.balance=balance;
	System.out.println("Account created Successfully");
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return CustomerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if(amount<=0)
			System.out.println("Invalid Deposit amount");
		else {
			balance=balance+amount;
			System.out.println("Deposit Successful!Updated balance "+balance);
		}
	}
	
	public void withdraw(double amount) {
		if(amount<=0)
			System.out.println("Invalid withdrawl amount");
		else if(amount>balance)
			System.out.println("Insufficient funds");
		else {
			balance=balance-amount;
			System.out.println("Withdrawl Successful! Remainig balance "+balance);
		}
	}
	public void showBalance() {
		System.out.println("Available Balance "+balance);
	}
	
}
