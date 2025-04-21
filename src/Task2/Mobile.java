package Task2;

public class Mobile {
	static String storeName="Tech World";
	String brand;
	double price;
	
	void showDetails() {
		System.out.println("Store Name : "+storeName);
		System.out.println("Mobile Brand : "+brand);
		System.out.println("Price : "+price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile obj=new Mobile();
		obj.brand="Realme";
		obj.price=20000;
		obj.showDetails();
		Mobile obj1=new Mobile();
		obj1.brand="Samsung";
		obj1.price=25000;
		obj1.showDetails();
	}

}
