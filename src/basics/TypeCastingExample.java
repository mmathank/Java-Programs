package core.java.basics;

public class TypeCastingExample {

	public static void main(String[] args) {
		
//	Auto-casting/Up-Casting	
	int intVar = 10;
	long longVar = intVar;
	System.out.println("longVar: " + longVar);
	
	byte byteVar = 20;
	double doubleVar = byteVar;
	System.out.println("doubleVar: " + doubleVar);
	
//	explicit casting is needed for down-casting
	int intVar2 = 123;
	byte byteVar2 = (byte) intVar2;
	System.out.println("byteVar2: " + byteVar2);
	
	float floatVar = 34.56f;
	int intVar3 = (int) floatVar;
	System.out.println("intVar3: " + intVar3);
	
//	overflow
	byte byteVar4 = (byte) -129;
	System.out.println("byteVar4: " + byteVar4);
	
//	Auto casting in Expressions
	byte a = 100;
	byte b = 28;
	int c =  (a + b);
	long e = 200;
	long d = c * e;
	System.out.println("c: " + c);
	System.out.println("d: " + d);
	}
}
