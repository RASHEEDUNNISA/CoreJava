package Switch;

public class GradeEvaluator {

	void getGrade(int marks) {
		switch(marks/10) {
		case 9,10:
			System.out.println("Grade : A");
			break;
		case 8:
			System.out.println("Grade : B");
			break;
		case 7:
			System.out.println("Grade : C");
			break;
		case 6:
			System.out.println("Grade : D");
			break;
		default:
			System.out.println("Grade : F");
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeEvaluator obj=new GradeEvaluator();
		obj.getGrade(95);
		obj.getGrade(80);
		obj.getGrade(70);
		obj.getGrade(60);
		obj.getGrade(25);
		obj.getGrade(88);
	}

}
