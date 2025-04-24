package com.anonymous;

interface NumberChecker{
	boolean checkNumber(int num);
}
interface CharChecker{
	void checkChar(char a);
}
public class FunctionalInterface {
	public static boolean isPrime(int num) {
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		NumberChecker num=new NumberChecker() {
			public boolean checkNumber(int num) {
				for(int i=2;i<=Math.sqrt((int)num);i++)
				{
					if(num%i==0)
						return false;
				}
				return true;
			}
			};
			
			CharChecker character=new CharChecker() {
				public void checkChar(char ch) {
				for(int i=2;i<=Math.sqrt((int)ch);i++)
				{
					if((int)ch%i==0) {
						System.out.println("Not a prime number");
						return ;
					}
				}
				System.out.println("A prime number");
				}
			};
			System.out.println(num.checkNumber(10));
			character.checkChar('C');
			System.out.println(isPrime('Z'));
	}
}
