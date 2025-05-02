package com.exceptionhandling;

public class CarTest {
	public static void stop(String str) throws CarStopped {
			if(str.equalsIgnoreCase("stop"))
				throw new CarStopped("Car is stopped");
			else
				System.out.println("Car not stalled");
	}
	public static void puncture(String str) throws CarPuncture {
		if(str.equalsIgnoreCase("puncture"))
			throw new CarPuncture("Car Punctured");
		else
			System.out.println("Car not punctured");
	}
	public static void carHeat(int temprature) throws CarHeat {
		if(temprature > 50)
			throw new CarHeat("Car is heated more than 50 degress");
		else
			System.out.println("Car not stalled");
	}
//	public static void main(String[] args)  {
//		try {
//		stop("stop");
//		puncture("puncture");
//		carHeat(60);
//		stop("Go");
//		}
//		catch(CarStopped | CarPuncture | CarHeat e) {
//			System.out.println(e.getMessage());
//			}
//	}
	public static void main(String[] args) {
		try {
		stop("stop");
		}
		catch(CarStopped e) {
			System.out.println(e.getMessage());
		}
		try {
			puncture("Puncture");
		}
		catch(CarPuncture e) {
			System.out.println(e.getMessage());
		}
		try {
			carHeat(60);
		}
		catch(CarHeat e) {
			System.out.println(e.getMessage());
		}
		try {
			stop("go");
			}
			catch(CarStopped e) {
				System.out.println(e.getMessage());
			}
		try {
			puncture("non-puncture");
		}
		catch(CarPuncture e) {
			System.out.println(e.getMessage());
		}
		try {
			carHeat(40);
		}
		catch(CarHeat e) {
			System.out.println(e.getMessage());
		}
	}
}
