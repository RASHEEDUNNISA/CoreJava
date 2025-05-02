package com.exceptionhandling;

public class Handling {
		public static void tiMethod(int num) {
			try {
				System.out.println("10000");
				ti1Method(num);
				System.out.println("Coders");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		public static void ti1Method(int num) throws Exception {
			try {
				int res=7/num;
				System.out.println("Completed");
			}
			catch(ArithmeticException e) {
				System.err.println("ArithmeticException: /by Zero");
			}
			finally {
				System.out.println("Finally");
			}
		}
}
