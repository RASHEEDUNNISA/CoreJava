package task4;

public class Product {
		String name;
		int id;
		double price;
		
		void addEmployeeDetails(String n, int i, double p) {
			name=n;
			id=i;
			price=p;
		}
		
		void displayDetails() {
			System.out.println("Employee Name : "+name);
			System.out.println("Employee ID : "+id);
			System.out.println("Employee Salary : "+price);

		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Product obj=new Product();
			obj.addEmployeeDetails("Paneer", 101, 100);
			obj.displayDetails();
		}

	}