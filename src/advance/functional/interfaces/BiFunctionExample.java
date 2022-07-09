package core.java.advance.functional.interfaces;

import java.util.List;
import java.util.function.BiFunction;

import core.java.advance.domain.Student;
import core.java.advance.domain.StudentDB;

public class BiFunctionExample {

	static BiFunction<Integer, String, String> idAndName = (id, name) -> {
		String result = id + " " + name;
		return result;
	};

	public static void main(String[] args) {

		List<Student> studentList = StudentDB.getStudentList();
		studentList.forEach((student -> idAndName.apply(student.getId(),student.getName())));
	}
}
