package com.arrays;
//import com.arrays.ArrayUtilities;
public class Arrays2 {
	static int[] arr=ArrayUtilities.createArray();
	public static void sumOfArray() {
		int sum=0;
		for(int i: arr) {
			sum+=i;
		}
		System.out.println("Sum of array elements = "+sum);
	}
	public static void evenOdd() {
		//int[] arr=ArrayUtilities.createArray();
		int sumE=0,sumO=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0)
				sumE+=arr[i];
			else if(i%2!=0)
				sumO+=arr[i];
		}
		System.out.println("Even Count = "+sumE);
		System.out.println("Odd Count = "+sumO);

	}
	public static void reverse() {
//		int[] arr=ArrayUtilities.createArray();
		System.out.println("Array in reverse order : ");
		for(int i=arr.length-1;i>=0;i--)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	public static void search(int ele) {
//		int[] arr=ArrayUtilities.createArray();
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				System.out.println("Element found at "+(i+1));
				found=true;
				return;
			}
		}
		if(found)
			System.out.println("Element found");
	}
	public static void copy() {
//		int[] arr=ArrayUtilities.createArray();
		int[] copy=new int[arr.length];
		for(int i=0;i<arr.length;i++)
			copy[i]=arr[i];
		System.out.print("Elements copied to new array : ");
		ArrayUtilities.display(copy);
		System.out.println(copy==arr);
	}
public static void main(String[] args) {
	System.out.println("--------------Sum of Array--------------------");
	sumOfArray();
	System.out.println("--------------Sum of Even and Odd--------------------");
	evenOdd();
	System.out.println("--------------Reverse of an Array--------------------");
	reverse();
	System.out.println("--------------Search an element in Array--------------------");
	search(5);
	System.out.println("--------------copy an Array--------------------");
	copy();
	
}
}
