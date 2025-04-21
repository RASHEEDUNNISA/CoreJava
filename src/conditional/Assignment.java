package conditional;

public class Assignment {

	public boolean isEven(int num) {
		return num%2==0;
	}
	
	public String checkNumber(int num) {
		if(num<0)
			return "Negative";
		else if(num>0)
			return "Positive";
		else return "Zero";
	}
	
	public boolean canVote(int age) {
		return (age>=18) ? true : false;
	}
	
	public int findGreater(int n1,int n2) {
		
			return (n1>n2) ? n1 : n2;
	}
	
	public boolean isDivisibleBy5(int num) {
		return num%5==0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment obj=new Assignment();
		System.out.println(obj.isEven(8));
		System.out.println(obj.checkNumber(0));
		System.out.println(obj.canVote(22));
		System.out.println(obj.findGreater(17,70));
		System.out.println(obj.isDivisibleBy5(45));
		System.out.println("---------------------------------");
		System.out.println(obj.isEven(7));
		System.out.println(obj.checkNumber(-3));
		System.out.println(obj.canVote(2));
		System.out.println(obj.findGreater(07,70));
		System.out.println(obj.isDivisibleBy5(47));
	}

}
