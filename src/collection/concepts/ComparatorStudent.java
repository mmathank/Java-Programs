package core.java.collection.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortById implements Comparator<ComparatorStudent> {

	@Override
	public int compare(ComparatorStudent o1, ComparatorStudent o2) {
		return o1.id - o2.id;
	}

}

class SortByName implements Comparator<ComparatorStudent> {

	@Override
	public int compare(ComparatorStudent o1, ComparatorStudent o2) {
		return o1.name.compareTo(o2.name);
	}

}

public class ComparatorStudent {

	int id;
	String name;

	public ComparatorStudent(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "id = " + id + ", name = " + name;
	}

	public static void main(String[] args) {

		ComparatorStudent s1 = new ComparatorStudent(01, "Mathankumar");
		ComparatorStudent s2 = new ComparatorStudent(02, "Dhanya");
		ComparatorStudent s3 = new ComparatorStudent(03, "User 3");

		List<ComparatorStudent> studentList = new ArrayList<>();
		studentList.add(s2);
		studentList.add(s1);
		studentList.add(s3);

		System.out.println("Sort By ID");
		Collections.sort(studentList,new SortById());
		studentList.forEach(System.out::println);
		
		System.out.println("\nSort By Name");
		Collections.sort(studentList,new SortByName());
		studentList.forEach(System.out::println);
	}
}
