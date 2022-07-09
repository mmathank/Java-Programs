package core.java.advance.domain;

import java.util.List;

public class Student {

	int id;
	String name;
	List<String> activities;
	List<Integer> marks;
	
	public Student() {
		
	}

	public Student(int id, String name, List<String> activities, List<Integer> marks) {
		super();
		this.id = id;
		this.name = name;
		this.activities = activities;
		this.marks = marks;
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

	public List<String> getActivities() {
		return activities;
	}

	public void setActivities(List<String> activities) {
		this.activities = activities;
	}
	
	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{ ")
		.append("\"id\" : \"").append(id)
		.append("\", \"name\" : \"").append(name)
		.append("\", \"activities\" : \"").append(activities)
		.append("\", \"marks\" : \"").append(marks)
		.append("\" }");
		return sb.toString();
	}
}
