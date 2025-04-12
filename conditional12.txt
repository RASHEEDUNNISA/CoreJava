package conditional;

public class Assignment2 {
	public boolean isEven(int num) {
		if(num%2==0)
			return true;
		else return false;
	}
	
	public String checkNumber(int num) {
		if(num<0)
			return "Negative";
		else if(num>0)
			return "Positive";
		else return "Zero";
	}
	
	public String isVowel(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			return "Vowel";
		else return "Consonant";
	}
	
	public int largestOfThree(int a,int b,int c) {
		if((a>b) && (a>c))
			return a;
		else if((b>a) && (b>c))
			return b;
		else if((c>a) && (c>b))
			return c;
		else return a;
	}
	
	public boolean canVote(int age) {
		return (age>=18) ? true : false;
		}
	
	public boolean isDivisibleBy511(int num) {
		return ((num%5==0) && (num%11==0))?true:false;
	}

	public static void main(String... args) {
	Assignment2 obj=new Assignment2();
	System.out.println(obj.isEven(11));
	System.out.println(obj.checkNumber(5));
	System.out.println(obj.isVowel('r'));
	System.out.println(obj.largestOfThree(10,2,30));
	System.out.println(obj.canVote(19));
	System.out.println(obj.isDivisibleBy511(55));
	}
}
