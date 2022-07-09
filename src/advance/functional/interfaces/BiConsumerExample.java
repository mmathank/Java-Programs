package core.java.advance.functional.interfaces;

import java.util.List;
import java.util.function.BiConsumer;

import core.java.advance.domain.Student;
import core.java.advance.domain.StudentDB;

public class BiConsumerExample {
	
	static BiConsumer<Student,List<String>> studentActivity = (student,activity) -> {
		System.out.println(student.getName() + " " + activity);
	};

	static BiConsumer<String, List<Integer>> studentMarks = new BiConsumer<String, List<Integer>>() {
		@Override
		public void accept(String name, List<Integer> marks) {
			System.out.println("Name: " + name + " " + "Mark: " + marks);
		}
	};
	
	static BiConsumer<Integer, String> idAndName = (id, name) -> {
		System.out.println("Id: " + id + " " + "Name: " + name);
	};

	public static void main(String[] args) {
		List<Student> studentList = StudentDB.getStudentList();
		studentList.forEach((student -> studentActivity.accept(student,student.getActivities())));
		studentList.forEach((student -> studentMarks.accept(student.getName(),student.getMarks())));
		studentList.forEach((student -> idAndName.accept(student.getId(),student.getName())));
	}

}
