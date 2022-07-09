package core.java.advance.stream;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStreamExample {

	public static void main(String[] args) {

		int[] scores = new int[] { 2, 1, 10, 98, 45, 25, 17, 8, 9, 54 };
		int[] emptyArray = new int[] {};

		IntStream scoresStream = Arrays.stream(scores);
		scoresStream.sorted().forEach((score -> System.out.print(score + " ")));

		OptionalInt empty = Arrays.stream(emptyArray).max();
		System.out.println("\n" + "Max Value of given array is: " + empty);

		OptionalInt maxNum = Arrays.stream(scores).max();
		System.out.println("Max Value of given array is: " + maxNum.getAsInt());

		OptionalInt minNum = Arrays.stream(scores).min();
		System.out.println("Min Value of given array is: " + minNum);

		OptionalDouble average = Arrays.stream(scores).average();
		System.out.println("Average Score is as OptionalDouble: " + average);

		Double doubleValue = average.getAsDouble();
		int intValue = doubleValue.intValue();
		System.out.println("Average Score is as int: " + intValue);

		List<Integer> integerList = Arrays.stream(scores).sorted().boxed().collect(toList());
		integerList.forEach((score -> System.out.print(score + " ")));

		List<Integer> integerList2 = Arrays.asList(20, 30, 40, 10, 15);
		OptionalDouble average2 = integerList2.stream().mapToInt((n) -> n).average();
		System.out.println("\nCalculate Average value from List<Integer>: " + average2.getAsDouble());

	}
}
