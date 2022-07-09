package core.java.collection.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionSortExample {

	static Set<Integer> numSet = new HashSet<>();
	static List<Integer> tempList = new ArrayList<>();
	
	public static void populateSet() {

		while (numSet.size() <= 10) {
			numSet.add((int) (Math.random() * 100));
		}

		List<Integer> numList = new ArrayList<>(numSet);
		Collections.sort(numList);
		System.out.println(numList);
	}

	public static void populateList() {

		while (tempList.size() <= 10) {
			tempList.add((int) (Math.random() * 100));
		}

		Collections.sort(tempList);
		System.out.println(tempList);
	}
	
	public static void main(String[] args) {
		populateSet();
		populateList();
		System.out.println(Math.random() * 100);
	}
}
