package core.java.advance.regex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RepeatNumberCheck {
	
	public static void main(String[] args) {
		
		int[] numbers = { 5, 8, 8, 8, 1, 1, 1, 2, 1, 1, 3, 3, 3, 7, 7, 9 };
		Arrays.sort(numbers);
		Map<Integer, Integer> numbersMap = new HashMap<>();
		
		int count = 0;		
		for (int k = 0; k < numbers.length - 1; k++) {
			if (numbers[k] == numbers[k + 1]) {
				++count;
				numbersMap.put(numbers[k], count);
			} else {
				count = 0;
			}
		}
		
		numbersMap.forEach((key, value) -> System.out.println("Key: " + key + "s " + "Repetitions: " + value));
	}
}
