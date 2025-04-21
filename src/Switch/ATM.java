package Switch;

public class ATM {

	void performTransaction(int option) {
		switch(option) {
		case 1:
			System.out.println("Withdraw Money Selected");
			break;
		case 2:
			System.out.println("Deposit Money Selected");
			break;
		case 3:
			System.out.println("Check Balance Selected");
			break;
		case 4:
			System.out.println("Exiting....");
			break;
		default :
			System.out.println("Invalid Option!!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm=new ATM();
		atm.performTransaction(1);
		atm.performTransaction(2);
		atm.performTransaction(3);
		atm.performTransaction(4);
		atm.performTransaction(5);

	}

}
