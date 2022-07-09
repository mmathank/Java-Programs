package core.java.collection.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableStudent implements Comparable<ComparableStudent> {

	int id;
	String name;
	
	public ComparableStudent(int id, String name) {
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
	public int compareTo(ComparableStudent o) {
//		return this.id - o.id;
		return this.name.compareTo(o.name);
	}
	
	@Override
	public String toString() {
		return "id = " + id + ", name = " + name;
	}

	public static void main(String[] args) {

		ComparableStudent s1 = new ComparableStudent(01,"Mathankumar");
		ComparableStudent s2 = new ComparableStudent(02,"Dhanya");
		ComparableStudent s3 = new ComparableStudent(03,"User 3");
		
		List<ComparableStudent> studentList = new ArrayList<>();
		studentList.add(s2);
		studentList.add(s1);
		studentList.add(s3);
		
		Collections.sort(studentList);
		
		for (ComparableStudent s : studentList)
			System.out.println(s);
	}
}
