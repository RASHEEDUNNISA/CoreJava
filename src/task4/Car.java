package task4;

public class Car {
	String make,model;
	String year;
	
	void addDetails(String carMake,String m,String y) {
		make=carMake;
		model=m;
		year=y;
	}
	
	void display() {
		System.out.println("Car Brand : "+make);
		System.out.println("Car Model : "+model);
		System.out.println("Car Manufacturing Year : "+year);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj=new Car();
		obj.addDetails("Toyota", "abc","2020");
		obj.display();
	}

}
