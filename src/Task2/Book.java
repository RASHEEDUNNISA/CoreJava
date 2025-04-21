package Task2;

public class Book {

	static String libraryName="BookLovers";
	String author,title;
	void displayInfo() {
		System.out.println("Library Name : "+libraryName);
		System.out.println("Book Title : "+title);
		System.out.println("Book Author : "+author);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj=new Book();
		obj.author="Ana Haung";
		obj.title="Twisted Love";
		obj.displayInfo();
		libraryName="BookHub";
		obj.displayInfo();
	}

}
