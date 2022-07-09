package core.java.advance.functional.interfaces;

import java.util.List;
import java.util.function.BiPredicate;

import core.java.advance.domain.Student;
import core.java.advance.domain.StudentDB;

public class BiPredicateExample {

	static BiPredicate<Integer, String> findStudent = (id, name) -> {
		return id == 01 && name.startsWith("M");
	};

	public static void main(String[] args) {

		List<Student> studentList = StudentDB.getStudentList();
		studentList.forEach((student -> {
			if (findStudent.test(student.getId(), student.getName())) {
				System.out.println(student);
			}
		}));

	}
}
