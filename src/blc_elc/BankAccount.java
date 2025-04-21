package blc_elc;

public class BankAccount {
	long accNum;
	String name;
	double balance;
	
	long getAccNum() {
		return accNum;
	}

	void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getBalance() {
		return balance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj=new BankAccount();
		obj.setAccNum(1234567890);
		obj.setName("Ahra Zoya");
		obj.setBalance(1000);
		
		System.out.println(obj.getAccNum()+" "+obj.getName()+" "+obj.getBalance());
		
		obj.setBalance(2000);
		System.out.println(obj.getAccNum()+" "+obj.getName()+" "+obj.getBalance());
	}

}
