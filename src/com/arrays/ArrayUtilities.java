package com.arrays;
import java.util.Scanner;
public interface ArrayUtilities {
	static int[] createArray(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		if(n==0) {
			sc.close();
			return null;
		}
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element at "+i+" :");
			arr[i]=sc.nextInt();
		}
		sc.close();
		return arr;
	}
	static void display(int[]arr) {
		for(int i: arr)
			System.out.print(i+" ");
	}
}
