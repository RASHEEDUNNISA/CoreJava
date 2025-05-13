package Thread;

public class NumberPrinter implements Runnable {
	private int start,end;
	public NumberPrinter(int start,int end){
		this.start=start;
		this.end=end;
	}
	public void run() {
		for(int i=start;i<=end;i+=2) {
			System.out.println(i+" ");
		}
	}
	public static void main(String[] args) throws InterruptedException{
		Runnable runnable=new NumberPrinter(2,20);
		Runnable runnable2=new NumberPrinter(1,19);
		Thread EvenNumber=new Thread(runnable);
		Thread OddNumber=new Thread(runnable2);
		EvenNumber.start();
		EvenNumber.join();
		OddNumber.start();
		OddNumber.join();
	}
}
	

