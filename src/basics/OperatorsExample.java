package core.java.basics;

public class OperatorsExample {

	public static void main(String[] args) {

		int price = 100;
		price += price;
		int tax = 10;
		int sum = price + tax;
		
		System.out.println(sum);
		if (sum >= 200) {
			System.out.println("Too High");
		} else {
			System.out.println("OK");
		}
		
		int counter = 0;
		System.out.println(counter++);
		System.out.println(counter);
		System.out.println(++counter);
		
		int amount1 = 10;
		
		if (amount1 >= 50 & amount1 < 55) {
			System.out.println("Second Class");
		} else if (amount1 > 55){
			System.out.println("First Class");
		} else 
			System.out.println("Third Class");
		
//		Data will not be printed if amount is lesser than 50 also greater than 100
		int amount2 = 95;
		int data = 0;
		if (amount2 > 50 && amount2 < 100 && (++data) >= 1) {
			System.out.println("Data: " + data);
		}
		
		int marks = 35;
		String result = marks > 35 ? "Pass" : "Fail";
		System.out.println("Result: " + result);
		
	}
}
