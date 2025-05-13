package Thread;

public class BankAccount {
	int balance=5000;
synchronized void deposit(int amount) {
	System.out.println(Thread.currentThread().getName());
	balance+=amount;
	System.out.println("After Deposit Updated Balance "+balance);
}
synchronized void withdraw(int amount) {
	System.out.println(Thread.currentThread().getName());
	if(amount>balance) {
		System.out.println("Insufficient funds");
		return;
	}
	balance-=amount;
	System.out.println("After Withdraw Updated Balance "+balance);
	}
}
class CustomerThread extends Thread{
	BankAccount bank=new BankAccount();
	public void run() {
		bank.deposit(1000);
		bank.withdraw(500);
	}
	public static void main(String[] args) {
		BankAccount bank=new BankAccount();
		Thread t1=new CustomerThread();
		Thread t2=new CustomerThread();
		t1.start();
		t2.start();
//		t1.run();t2.run();
	}
}
