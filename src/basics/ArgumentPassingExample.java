package core.java.basics;

public class ArgumentPassingExample {
	
	int price;
	ArgumentPassingExample valueObj;
	
	public ArgumentPassingExample(int price) {
		this.price = price;
	}
	
	public void showPrice() {
		System.out.println("Price: " + price);
	}
	
	public ArgumentPassingExample updatePrice(ArgumentPassingExample obj) {
		
		obj.price = 200;
		return obj;
	}
	
	public void testPrimitives(int a, int b) {
		
		a = 100;
		b = 200;
		System.out.println("a: " + a + " b: " + b);
	}

	public static void main(String[] args) {

		ArgumentPassingExample apeObj = new ArgumentPassingExample(100);
		apeObj.showPrice();
		
//		passing reference by copying its value
		ArgumentPassingExample returnedObj = apeObj.updatePrice(apeObj);
		System.out.println("Updated Price: " + returnedObj.price);
		
//		passing primitives
		int a = 5;
		int b = 15;
		apeObj.testPrimitives(a, b);
		System.out.println("a: " + a + " b: " + b);
	}
}
