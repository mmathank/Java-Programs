package core.java.collection.concepts;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		Map<Integer, String> studentMap = new HashMap<>();

		studentMap.put(new Integer(01), "Mathankumar");
		studentMap.put(02, "Dhanya");
		studentMap.put(new Integer(01), "Mathankumar");

		System.out.println(studentMap.get(01));
		System.out.println(studentMap.get(02));

//		Using keySet() method
		System.out.println("\nList of Keys");
		for (Integer i : studentMap.keySet()) {
			System.out.println(i);
		}

//		Using values() method
		System.out.println("\nList of Values");
		for (String s : studentMap.values()) {
			System.out.println(s);
		}

//		Using entrySet() method
		System.out.println("\nKey - Value Pairs:");
		for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
			System.out.println("Student Id: " + entry.getKey() + " " + "Name: " + entry.getValue());
		}
	}

}
