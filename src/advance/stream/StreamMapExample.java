package core.java.advance.stream;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

import core.java.advance.domain.Student;
import core.java.advance.domain.StudentDB;

public class StreamMapExample {

	public static void main(String args[]) {

		List<Student> studentList = new ArrayList<>();
		studentList = StudentDB.getStudentList();

		List<String> namesList = studentList.stream()
				.map(Student::getName)
				.sorted()
				.collect(toList());
		namesList.forEach(System.out::println);

		List<String> activityList = studentList.stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.collect(toList());
		activityList.forEach(System.out::println);

		long totalActivities = studentList.stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.count();
		System.out.println("totalActivities: " + totalActivities);
	}
}
