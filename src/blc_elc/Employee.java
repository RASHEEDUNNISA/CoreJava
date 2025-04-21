package blc_elc;

public class Employee {
	int id;
	String name;
	double salary;
	
	 int getId() {
		return id;
	}

	 void setId(int id) {
		this.id = id;
	}

	 String getName() {
		return name;
	}

	 void setName(String name) {
		this.name = name;
	}

	 double getSalary() {
		return salary;
	}

	 void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee obj=new Employee();
		 obj.setId(1);
		 obj.setName("Kulsum");
		 obj.setSalary(10000);
		 System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getSalary());
		 obj.setSalary(20000);
		 System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getSalary());
	}

}
