package Thread;

public class HelloWorld {
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread() {
			public void run() {
				System.out.println("Hello");
			}
		};
		Runnable t2=()->System.out.println("World");
		t1.start();
		t1.join();
		Thread thread=new Thread(t2);
		thread.start();
	}
}
