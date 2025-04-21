package blc_elc;

public class Car {
	int id;
	String brand;
	String model;
	double price;
	
	int getId() {
		return id;
	}


	void setId(int id) {
		this.id = id;
	}


	String getBrand() {
		return brand;
	}


	void setBrand(String brand) {
		this.brand = brand;
	}


	String getModel() {
		return model;
	}


	void setModel(String model) {
		this.model = model;
	}


	double getPrice() {
		return price;
	}


	void setPrice(double price) {
		this.price = price;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		car.setId(100);
		car.setBrand("Toyota");
		car.setModel("xyz");
		car.setPrice(90000);
		
		 System.out.println(car.getId()+" "+car.getBrand()+" "+car.getModel()+" "+car.getPrice());
	}

}
