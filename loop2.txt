package forloop;

public class AsciiLcm {
		public void getAsci() {
			for(int i='A';i<='Z';i++) {
				System.out.print(i+" ");
			}
		}
		public void leastCommonNumbers() {
			int num1=15;int num2=25;
			int min=(num1<num2)?num1:num2;
			int lcm=0;
			for (int i=1; i<=min;i++) {
				if((i%5==0)&&(i%10==0)) {
				  lcm=i;
				}	
			}
			System.out.println(lcm);
		}
	  public static void main(String[] args){
		  AsciiLcm obj = new AsciiLcm();
		  obj.getAsci();
		  System.out.println();
		   obj.leastCommonNumbers();
		
	   }
	}