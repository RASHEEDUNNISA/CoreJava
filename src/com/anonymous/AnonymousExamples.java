package com.anonymous;

interface Vehicle{
	void start();
}

interface Calculater{
	int add(int a,int b);
}

interface Logger{
	void log(String msg);
}
interface Timer{
	void startTimer(int seconds);
}
public class AnonymousExamples {
public static void main(String[] args) {
	Vehicle vehicle=new Vehicle() {
		public void start() {
			System.out.println("The Vehicle is starting");
		}
	};
	vehicle.start();
	System.out.println("-------------------------------------------------");
	Calculater cal=new Calculater() {
		public int add(int a,int b) {
			return a+b;
		}
	};
	System.out.println(cal.add(10,20));
	System.out.println("-------------------------------------------------");
	Logger log=new Logger() {
		public void log(String msg) {
			System.out.println("Log: "+msg);
		}
	};
	log.log("System Error Occured");
	System.out.println("-------------------------------------------------");
	Timer time=new Timer() {
		public void startTimer(int seconds){
			System.out.println("Timer started for "+seconds+" seconds");
		}
	};
	time.startTimer(10);
}
}
