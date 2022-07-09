package core.java.basics;

public class StaticKeywordExample {
	
	static int counter;

	static final int FIXED_PRICE = 10;
	
	public StaticKeywordExample() {
		counter++;
	}
	
	
	public static int getCounter() {
		return counter;
	}

	public static void main(String[] args) {

		new StaticKeywordExample();
		StaticKeywordExample obj2 = new StaticKeywordExample();
		StaticKeywordExample temp = new StaticKeywordExample();
		temp.counter = 10;
		
		System.out.println("No of Instances created: " + getCounter());
		System.out.println("Changes not allowed: " + StaticKeywordExample.FIXED_PRICE);
		System.out.println(obj2.counter);
	}

}
