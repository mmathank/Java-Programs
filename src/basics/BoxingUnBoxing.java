package core.java.basics;

public class BoxingUnBoxing {

	public static void main(String[] args) {

		int intPrimitive = 54382;
		Integer intObj = intPrimitive;
		System.out.println("IntObj value is: " + intObj);
		
		String data = "562";
		Integer number = Integer.valueOf(data);
		int num = Integer.parseInt(data);
		System.out.println("Data is: " + number);
		System.out.println("Num is: " + num);
		
//		show how to handle exception
		String incorrectData = "Test";
//		int invalidData = Integer.valueOf(incorrectData);
//		System.out.println("InvalidData: " + invalidData);
		
		int data2 = 123456;
		String stringFromNum = String.valueOf(data2);
		System.out.println("String from Number: " + stringFromNum);
	}

}
