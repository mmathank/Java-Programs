package core.java.advance.stream.terminal;

import static java.util.stream.Collectors.joining;

import java.util.List;

import core.java.advance.domain.Student;
import core.java.advance.domain.StudentDB;

public class JoiningExample {

	public static void main(String[] args) {

		List<Student> studentList = StudentDB.getStudentList();

		System.out.println(studentList.stream().map(Student::getName).collect(joining("-")));

		System.out.println(studentList.stream().map(Student::getName).collect(joining(",", "{", "}")));
	}
}
