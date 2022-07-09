package core.java.basics;

public class EnumExample1 {

	public static void main(String[] args) {

		Company c1 = Company.EBS;
		Company c2 = Company.FORD;
		Company c3 = Company.CTS;

//		Printing order of the items
		System.out.println(c1.ordinal());
		System.out.println(c2);
		System.out.println(c3.ordinal());
		
		for(Company x : Company.values())	
			System.out.println(x);

		for (Company c : Company.values()) {
			if (c == Company.FORD)
				System.out.println("Automobile");
			else if (c == Company.EBS)
				System.out.println("Payment Gateway");
			else
				System.out.println("BFS Client");
		}
	}

}
