package core.java.collection.concepts;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	static List<Integer> numberList = new ArrayList<>();

	public static void main(String[] args) {

		numberList.add(30);
		numberList.add(0,10);
		numberList.add(2,20);
		numberList.add(3,20);
		
//		numberList.remove(10);
//	numberList.remove((Object) 10);

// 	IndexOutOfBoundsException
//	numberList.add(3,20);
		
		System.out.println(numberList);
	}

}
