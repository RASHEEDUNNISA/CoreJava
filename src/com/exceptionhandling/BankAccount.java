package com.exceptionhandling;
public class BankAccount {
	double balance;
	public BankAccount(double balance) {
		this.balance=balance;
	}
//	public void performTransaction(double amount) throws InvalidTransactionException {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your choice");
//		String str=sc.next();
//		switch(str.toLowerCase()) {
//		case "deposit" ->{
//			if(amount<=0)
//				throw new InvalidTransactionException("Transaction amount must be positive");
//			else
//				System.out.println("Transaction successful. New balance: "+(balance+amount));
//		}
//		case "Withdraw" ->{
//			if(amount>balance)
//				throw new InvalidTransactionException("Transaction Error: Insufficient funds for the transaction");
//			else
//				System.out.println("Withdrawl successful. New balance: "+(balance-amount));
//		}
//		}
//	}
	public void performTransaction(double amount) throws InvalidTransactionException {
				if(amount<=0)
					throw new InvalidTransactionException("Transaction Error: Transaction amount must be positive");
				else if(amount>balance)
					throw new InvalidTransactionException("Transaction Error: Insufficient funds for the transaction");
				else
					System.out.println("Transaction successful. New balance: "+(balance+amount));
//				else
//					System.out.println("Withdrawl successful. New balance: "+(balance-amount));
			}
	public void withdraw(double amount) throws InsufficientFundsException,IllegalArgumentException {
		if(amount>balance)
			throw new InsufficientFundsException("Transaction Error: Insufficient funds for the transaction");
		else if(amount<=0)
			throw new IllegalArgumentException("Withdrawal Error: Withdrawal amount must be positive");
		else
			System.out.println("Withdrawl Scuccessful: "+(balance-amount));
	}
	public static void main(String[] args) {
		BankAccount bank=new BankAccount(1000);
		try {
			bank.performTransaction(500);
		}
		catch(InvalidTransactionException e) {
			System.out.println(e.getMessage());
		}
		try {
			bank.performTransaction(-50);
		}
		catch(InvalidTransactionException e) {
			System.out.println(e.getMessage());
		}
		try {
			bank.performTransaction(1200);
		}
		catch(InvalidTransactionException e) {
			System.out.println(e.getMessage());
		}
		try {
			bank.withdraw(200);
		}		catch(InsufficientFundsException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			bank.withdraw(-50);
		}		catch(InsufficientFundsException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			bank.withdraw(1500);
		}		catch(InsufficientFundsException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			bank.withdraw(0);
		}		catch(InsufficientFundsException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}