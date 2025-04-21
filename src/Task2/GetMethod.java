package Task2;

public class GetMethod {

	byte b=8;
	int i=200;
	short s=100;
	long l=7895625;
	float f=41366588f;
	double d=156545;
	char ch='a';
	boolean bool=true;
	String str="Rashee";
	
	byte getByteValue() {
		return b;
	}
	short getShortValue() {
		return s;
	}
	int getIntValue() {
		return i;
	}
	long getLongValue() {
		return l;
	}
	float getFloatValue() {
		return f;
	}
	Double getDoubleValue() {
		return d;
	}
	char getCharValue() {
		return ch;
	}
	boolean getBoolValue() {
		return bool;
	}
	String getStringValue() {
		return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetMethod obj=new GetMethod();
		byte b=obj.getByteValue();
		short i=obj.getShortValue();
		int s=obj.getIntValue();
		long l=obj.getLongValue();
		float f=obj.getFloatValue();
		double d=obj.getDoubleValue();
		char ch=obj.getCharValue();
		boolean bool=obj.getBoolValue();
		String str=obj.getStringValue();
		
		System.out.println("Byte "+b);
		System.out.println("int "+i);
		System.out.println("short "+s);
		System.out.println("long "+l);
		System.out.println("float"+f);
		System.out.println("double "+d);
		System.out.println("Char "+ch);
		System.out.println("Boolean "+bool);
		System.out.println("String "+str);
	}

}
