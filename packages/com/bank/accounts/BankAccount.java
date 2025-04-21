package com.bank.accounts;

public class BankAccount {
	private String accNo;
	private double balance;
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void showAccDetails() {
		System.out.println("Account Number "+accNo);
		System.out.println("Balance "+balance);
	}
}
