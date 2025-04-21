package com.bank.customers;

public class Customer {
	private String customerName;
	private int custID;
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public void showCustomerDetails() {
		System.out.println("Customer Name "+customerName);
		System.out.println("Customer ID "+custID);
	}
	
}
