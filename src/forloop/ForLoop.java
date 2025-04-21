package forloop;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("For Loop from 1 to 10");
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("For Loop in Reverse Order");
		for(int i=10;i>0;i--)
			System.out.print(i+" ");
		System.out.println();
		System.out.println("Even Numbers from 2 to 20");
		for(int i=2;i<=20;i+=2)
				System.out.print(i+" ");
		System.out.println();
		System.out.println("Odd Numbers from 1 to 15");
		for(int i=1;i<=15;i+=2)
			System.out.print(i+" ");
		System.out.println();
		System.out.println("5 to 50 step by 5");
		for(int i=5;i<51;i+=5)
			System.out.print(i+" ");
	}
	
}
