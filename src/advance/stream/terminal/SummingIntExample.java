package core.java.advance.stream.terminal;

import static java.util.stream.Collectors.summingInt;

import java.util.List;

import core.java.advance.domain.Student;
import core.java.advance.domain.StudentDB;

public class SummingIntExample {

	public static void main(String[] args) {

		List<Student> studentList = StudentDB.getStudentList();
		int totalId = studentList.stream().collect(summingInt(Student::getId));
		System.out.println(totalId);
	}
}
