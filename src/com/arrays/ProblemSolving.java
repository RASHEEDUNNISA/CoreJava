package com.arrays;
import java.util.HashMap;
import java.util.Map;
public class ProblemSolving {

	public static void minMax(int[] arr) {
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		for(int i:arr) {
			if(i<min)
				min=i;
			if(i>=max)
				max=i;
		}
		System.out.println("Minimum Value :"+min+" Maximum Value :"+max);
	}
	public static void frequency(int[] arr) {
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i:arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
//		System.out.println(map.entrySet());
		for(Map.Entry<Integer,Integer> m:map.entrySet()) {
			System.out.println(m.getKey()+" occurs "+m.getValue()+" times");
		}
	}
	
	public static void secondLargest(int[]arr) {
		int max=Integer.MIN_VALUE,max1=Integer.MIN_VALUE;
		for(int i:arr) {
			if(i>max) {
				max1=max;
				max=i;
			}
			 if((i>max1) && (i!=max))
				max1=i;
//			System.out.println("i "+i+" max "+max+" max1 "+max1);
		}
		System.out.println("Second largest Number :"+max1);
	}
	public static void main(String[] args) {
		minMax(new int[] {100,20,30,50,60});
		frequency(new int[] {1,2,3,4,5,1,2,3,4,5,1,2,3});
		secondLargest(new int[] {10,20,30,40,50});
		System.out.println();
		minMax(new int[] {3,9,2,5,6});
		frequency(new int[] {1,2,2,3,3,3});
		secondLargest(new int[] {12,35,1,34,1,10});
	}

}
