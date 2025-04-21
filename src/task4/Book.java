package task4;

public class Book {
		String title;
		String author;
		String isbn;
		
		void addEmployeeDetails(String t, String a, String i) {
			title=t;
			author=a;
			isbn=i;
		}
		
		void displayDetails() {
			System.out.println("Employee Name : "+title);
			System.out.println("Employee ID : "+author);
			System.out.println("Employee Salary : "+isbn);

		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Book obj=new Book();
			obj.addEmployeeDetails("Peer e Kamil", "Nimra Ahmad", "ISBN1245");
			obj.displayDetails();
		}

	}