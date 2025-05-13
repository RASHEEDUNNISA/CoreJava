package Thread;

class Printer {
	int paperCount;
	public Printer(int paperCount) {
		this.paperCount=paperCount;
	}
	synchronized public void printDocument(String document,String userName) {
		if(paperCount>=1) {
				paperCount--;
			System.out.println("User Name: "+userName+" Document being printed: "+document+" papers left: "+paperCount);
			}
			else
			System.out.println("No papers available to print");
		}
}
class User extends Thread{
	String name;
	Printer printer;
	String document;
	public User(String name,Printer printer, String document) {
		this.name=name;
		this.printer=printer;
		this.document=document;
	}
	public void run() {
		printer.printDocument(document, name);
	}
}
class PrinterSimulation{
	public static void main(String[] args) {
		Printer printer=new Printer(3);
		Thread t1=new User("Rashee",printer,"this is first user thread");
		Thread t2=new User("Mehathab",printer,"this is second user thread");
		Thread t3=new User("Ammu",printer,"this is third user thread");
		Thread t4=new User("Dunnisa",printer,"this is fourth user thread");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

