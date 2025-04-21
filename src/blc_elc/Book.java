package blc_elc;

public class Book {
	int id;
	String title;
	String author;
	double price;
	
	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	String getAuthor() {
		return author;
	}

	void setAuthor(String author) {
		this.author = author;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj=new Book();
		obj.setId(1);
		obj.setTitle("White Nights");
		obj.setAuthor("Foyor");
		obj.setPrice(110);
		 System.out.println(obj.getId()+" "+obj.getTitle()+" "+obj.getAuthor()+" "+obj.getPrice());

	}

}
