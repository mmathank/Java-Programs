package core.java.advance.functional.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import core.java.advance.domain.Student;
import core.java.advance.domain.StudentDB;

public class FuntionExample {

	static Function<String, String> studentName = (s) -> s.toUpperCase();

	static Function<List<String>, List<String>> activityList = (activities) -> {

		List<String> activityInLowerCase = new ArrayList<>();
		for (String s : activities) {
			activityInLowerCase.add(s.toLowerCase());
		}
		return activityInLowerCase;
	};

	public static void main(String[] args) {

		List<Student> studentList = StudentDB.getStudentList();
		studentList.forEach((student -> {
			System.out.println(studentName.apply(student.getName()));
		}));

		studentList.forEach((student -> {
			System.out.println(activityList.apply(student.getActivities()));
		}));
	}
}
