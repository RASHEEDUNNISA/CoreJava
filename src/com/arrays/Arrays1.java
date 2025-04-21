package com.arrays;

public class Arrays1 {
	public static void main(String[] args) {
		int[] intarr=new int[] {10,20,30};
		for(int i=0;i<3;i++)
			System.out.print(intarr[i]+" ");
	System.out.println();
	String[] strarr={"John","Alice","Bob","Bob"};
	for(int i=0;i<3;i++)
		System.out.print(strarr[i]+" ");
	System.out.println();
	double[] doublearr=new double[] {10.5,20.75,30.25};
	for(double d:doublearr)
	System.out.print(d+" ");
	System.out.println();
	char[] chararr=new char[] {'A','B','C','D','E'};
	for(char c:chararr)
	System.out.print(c+" ");
	System.out.println();
	boolean[] boolarr= {true,false};
	for(int i=0;i<2;i++)
		System.out.print(boolarr[i]+" ");
	System.out.println();
	int[] intarr2={5,15,25,35,45};
	for(int i:intarr2)
		System.out.print(i+" ");
	System.out.println();
	String[] strarr2= {"Delhi","Mumbai","Chennai"};
	for(String s:strarr2)
		System.out.print(s+" ");
	System.out.println();
	float[] floatarr=new float[4];
	floatarr[0]= 1.1f;
	floatarr[1]= 2.2f;
	floatarr[2]= 3.3f;
	floatarr[3]= 4.4f;
	for(float f: floatarr)
		System.out.print(f+" ");
	System.out.println();
	long[] longarr= {100000L,200000L,300000L};
	for(int l=0;l<3;l++)
		System.out.print(longarr[l]+" ");
	System.out.println();
	short[] sarr=new short[4];
	sarr[0]=100;
	sarr[1]=200;
	sarr[2]=300;
	sarr[3]=400;
	for(short s:sarr)
		System.out.print(s+" ");
}
}
