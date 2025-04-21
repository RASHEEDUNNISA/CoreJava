package com.bank.app;
import com.bank.accounts.*;
import com.bank.customers.*;
public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba=new BankAccount();
		Customer c=new Customer();
		
		ba.setAccNo("123456789");
		ba.setBalance(70000);
		
		c.setCustID(100);
		c.setCustomerName("Buddi");
		
		c.showCustomerDetails();
		System.err.println();
		 ba.showAccDetails();
	}

}
