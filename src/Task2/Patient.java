package Task2;

public class Patient {

	static String hospitalName="Kims";
	String name;
	int age;
	void printDetails() {
		System.out.println("Hospital Name : "+hospitalName);
		System.out.println("Patient Name : "+name);
		System.out.println("Patient age : "+age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient obj=new Patient();
		obj.name="John Doe";
		obj.age=25;
		obj.printDetails();
		
		Patient obj1=new Patient();
		obj1.name="Emma";
		obj1.age=70;
		obj1.printDetails();
		
	}

}
