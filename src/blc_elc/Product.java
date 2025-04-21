package blc_elc;

public class Product {

	int id;
	String name;
	double price;
	int quantity;
	
	void setId(int i) {
		id=i;
	}
	void setName(String n) {
		name=n;
	}
	void setPrice(double p) {
		price = p;
	}
	void setQuantity(int q) {
		quantity=q;
	}
	
	int getId() {
		return id;
	}
	String getName() {
		return name;
	}
	double getPrice() {
		return price;
	}
	int getQuantity() {
		return quantity;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product();
		p.setId(1);
		p.setName("Paneer");
		p.setPrice(100);
		p.setQuantity(2);
		
		System.out.println("Id "+p.getId());	
		System.out.println("Name "+p.getName());	
		System.out.println("price "+p.getPrice());	
		System.out.println("Quantiyt "+p.getQuantity());
		
		Product p1=new Product();
		p1.setId(2);
		p1.setName("Manchuria");
		p1.setPrice(50);
		p1.setQuantity(3);
		
		System.out.println("Id "+p1.getId());	
		System.out.println("Name "+p1.getName());	
		System.out.println("price "+p1.getPrice());	
		System.out.println("Quantiyt "+p1.getQuantity());
	}

}
