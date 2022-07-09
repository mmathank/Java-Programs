package core.java.basics;

import java.util.Arrays;

public class PassingArgumentsExample {

	int price;

	public PassingArgumentsExample(int price) {
		System.out.println("Object Created via Parameterized constructor");
		this.price = price;
	}
	
	int showPrice(int p) {
		price = p;
		return price;
	}

	void showPriceList(int[] priceList) {
		System.out.println(Arrays.toString(priceList));
	}
	
	int[] returnPriceList(int[] priceList) {
		return priceList;
	}
	
	void showObject(PassingArgumentsExample obj) {
		System.out.print(obj.price);
	}

	public static void main(String[] args) {

		PassingArgumentsExample pae = new PassingArgumentsExample(1);
		
		PassingArgumentsExample obj1 = new PassingArgumentsExample(500);
		
		int result = pae.showPrice(100);
		System.out.println("Result: " + result);

		int[] prices = new int[] { 10, 20, 20, 30 };
		pae.showPriceList(prices);
		
		int[] tempArr = pae.returnPriceList(prices);
		System.out.println(Arrays.toString(tempArr));
		
		pae.showObject(obj1);
		
		String s1 = new String("     Mathan   ");
		System.out.println(s1.trim());
		System.out.println(s1.length());
	}
}
