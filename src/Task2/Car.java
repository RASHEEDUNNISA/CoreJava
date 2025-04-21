package Task2;

public class Car {

	static String showroomName="Honda";
	String modelName;
	double price;
	void displayDetails() {
		System.out.println("Showroom Name : "+showroomName);
		System.out.println("Car Model : "+ modelName);
		System.out.println("Car Price : "+price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj=new Car();
		obj.modelName="Tesla Model";
		obj.price=80000;
		obj.displayDetails();
		showroomName="Elite Motors";
		obj.displayDetails();
		
		Car obj1=new Car();
		obj1.modelName="BMW x5";
		obj1.price=75000;
		obj1.displayDetails();
		
	}

}
