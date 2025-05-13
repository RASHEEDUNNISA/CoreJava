package com.thread;

class MyThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println("Hello from mythread");
	}
}
class MyRunnable implements Runnable{
	public void run() {
		for(int i=0;i<3;i++)
			System.out.println("Runnable thread is running");
	}
}
class FirstThread extends Thread{
	public void run() {
		System.out.println("First thread message");
	}
}
class SecondThread extends Thread{
	public void run() {
		System.out.println("Second thread message");
	}
}
class NumberPrinter1 implements Runnable{
	public void run() {
		for(int i=0;i<3;i++)
			System.out.println(i+" ");
	}
}
class ShowThreadName extends Thread{
	public void run() {
		System.out.println("Thread Name: "+Thread.currentThread().getName());
	}
}
public class Assignment1 {
	public static void main(String[] args) {
		System.out.println("-----------------------First Program-----------------------");
	Thread t1=new MyThread();
	t1.start();
	System.out.println("-----------------------Second Program-----------------------");
	Runnable runnable=new MyRunnable();
	Thread t2=new Thread(runnable);
	t2.start();
	System.out.println("-----------------------Third Program-----------------------");
	FirstThread ft=new FirstThread();
	SecondThread st=new SecondThread();
	ft.start();
	st.start();
	System.out.println("-----------------------Fourth Program-----------------------");
	Runnable obj=new NumberPrinter1();
	Thread t3=new Thread(obj);
	t3.start();
	System.out.println("-----------------------Fifth Program-----------------------");
	Thread obj2=new ShowThreadName();
	obj2.setName("MyCustomThread");
	obj2.start();
	}
}
