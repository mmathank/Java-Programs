package core.java.basics;

public class ArrayLimitation {

	static int[] num;

	public static void main(String[] args) {

		num = new int[3];
		num[0] = 10;
		num[2] = 30;
		num[0] = 100;
		num[3] = 50;

		System.out.println(num[0]);
		System.out.println(num[2]);
		System.out.println(num[1]);
		
//		IndexOutOfBoundsException
		System.out.println(num[3]);
	}

}
