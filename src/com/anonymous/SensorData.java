package com.anonymous;
import java.util.function.Function;
 public class SensorData {
	private double temprature,humidity;
	public SensorData(double temprature,double humidity) {
		this.temprature=temprature;
		this.humidity=humidity;
	}
	public double getTemprature() {
		return temprature;
	}
	public void setTemprature(double temprature) {
		this.temprature = temprature;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	
	}
 class Main{
	 public static void main(String[] args) {
		Function<SensorData,Double> fun=new Function<SensorData,Double>(){
			public Double apply(SensorData sd) {
				return sd.getTemprature();
			}
		};
		double extract=fun.apply(new SensorData(36,50));
		System.out.println("Temprature is "+extract+"C");
		double threshhold=25;
		Function<Double,Boolean> fun2=new Function<Double,Boolean>(){
			public Boolean apply(Double temp) {
				if(temp>threshhold) return true;
				return false;
			}
		};
		Boolean check=fun2.apply(extract);
		System.out.println(check?"Temprature is above threshhold":"Temprature is below threshhold");
	}
 }
