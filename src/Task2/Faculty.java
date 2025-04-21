package Task2;

public class Faculty {

	static String uniName="Standford University";
	String facultyName,department;
	void showFacultyDetails() {
		System.out.println("University Name : "+uniName);
		System.out.println("Faculty Name : "+facultyName);
		System.out.println("Department : "+department);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Faculty obj=new Faculty();
		obj.facultyName="Dr. Robert Brown";
		obj.department="Computer Science";
		obj.showFacultyDetails();
		System.out.println("-----------------------------------------");
		Faculty obj1=new Faculty();
		obj1.facultyName="Dr. Lisa Green";
		obj1.department="Physics ";
		obj1.showFacultyDetails();
	}

}
