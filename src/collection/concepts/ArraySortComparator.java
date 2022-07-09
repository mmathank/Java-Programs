package core.java.collection.concepts;

import java.util.Arrays;

public class ArraySortComparator {

	static String[] fruits = { "orange", "Apple", "Banana", "banana", "Apple", "Orange" };
	static Integer[] numbers = {10, 5, 22, 55, 3, 7};

	public static void main(String[] args) {

		// using comparator
		Arrays.sort(fruits, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(fruits));
		
		Arrays.sort(fruits);
		System.out.println(Arrays.toString(fruits));
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}
