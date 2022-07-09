package core.java.advance.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTraverseExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("User1", "User2");

		names.forEach(System.out::println);
		System.out.println("------------------");

		names.forEach(System.out::println);
		System.out.println("------------------");

		Stream<String> nameStream = names.stream();
		nameStream.forEach(System.out::println);

//		cannot traverse the stream more than once
//		nameStream.forEach(System.out::println);
	}

}
