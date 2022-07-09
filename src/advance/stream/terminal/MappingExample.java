package core.java.advance.stream.terminal;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

import core.java.advance.domain.Student;
import core.java.advance.domain.StudentDB;

public class MappingExample {

	public static void main(String[] args) {
		List<Student> studentList = StudentDB.getStudentList();
		List<String> namesList = studentList.stream().collect(mapping(Student::getName, toList()));
		namesList.forEach(System.out::println);
		
		List<String> namesList2 = new ArrayList<>();
		for(Student student : studentList) {
			namesList2.add(student.getName());
		}
		namesList2.forEach(System.out::println);
	}

}
