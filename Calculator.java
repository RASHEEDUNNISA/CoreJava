package task1;

public class Calculator {

	int addTwoNumbers(int a, int b) {
		return a+b;
	}
	
	int mutliplyTwoNumbers(int a,int b) {
		return a*b;
	}
	
	int squareOfNumber(int n) {
		return n*n;
	}
	
	double averageOfThreeNumbers(double a,double b,double c) {
		return (a+b+c)/3;
	}
	
	double simpleIntrest(double principle,double rate,double time) {
		return (principle*rate*time)/100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj=new Calculator();
		System.out.println(obj.addTwoNumbers(5, 6));
		System.out.println(obj.mutliplyTwoNumbers(5, 3));
		System.out.println(obj.squareOfNumber(7));
		System.out.println(obj.averageOfThreeNumbers(2, 4,6));
		System.out.println(obj.simpleIntrest(5000, 0.5, 2));
	}

}
