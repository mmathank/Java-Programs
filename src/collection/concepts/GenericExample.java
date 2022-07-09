package core.java.collection.concepts;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {

		List<Integer> numberList = new ArrayList<>();
		numberList.add(10); 
		numberList.add(new Integer(20));
		
//		Stronger Type Check at Compile Time
//		numberList.add(new String("Mathan"));
		
		Integer a = numberList.get(0);
		
//		No need of explicit casting while retrieving the items
		int b = (int) numberList.get(1);
		int c = (int) numberList.get(2);
		
		System.out.println(numberList);
		
		
	}

}
