package core.java.basics;

public class DataTypesExample {
	
	int price = 100;
	static int count = 120;

	public static void main(String[] args) {

//		Integer Variables in Java
		byte byteVar = 127;
		short shortVar = 32767;
		int intVar = 33000;
		long longVar = 522326565632653L;
		
//		Floating Numbers in Java
		float floatVar = 10.20f;
		double doubleVar = 11.21;
		
//		To store Unicode characters
		char charVar1 = 'X';
		char charVar2 = 'a';
		
		
//		Boolean Values True/False
		boolean booleanVar1 = true;
		boolean booleanVar2 = false;
		
		System.out.println("byte: " + byteVar);
		System.out.println("short: " + shortVar);
		System.out.println("int: " + intVar);
		System.out.println("long: " + longVar);
		System.out.println("float: " + floatVar);
		System.out.println("double: " + doubleVar);
		System.out.println("char1: " + charVar1);
		System.out.println("char2: " + charVar2);
		System.out.println("booleanVar1: " + booleanVar1);
		System.out.println("booleanVar2: " + booleanVar2);
		
		System.out.println("Char will be converted to Int implicitly");
		System.out.println(charVar1 + charVar2);
		
		
		byte byteVar2 = (byte) 130;
		System.out.println("byteVar2: " + byteVar2);
		
		short shortVar2 = (short) 52245;
		System.out.println("shortVar2: " + shortVar2);
		
		byte byteVar3 = (int) 1;
		System.out.println("byteVar3: " + byteVar3);
		
	}

}
