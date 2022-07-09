package core.java.advance.domain;

import java.util.Arrays;
import java.util.List;

public class StudentDB {

	static Student s1 = new Student(01, "Mathan", Arrays.asList("Swimming", "Basket Ball","Swimming"), Arrays.asList(90, 90, 90));
	static Student s2 = new Student(02, "Dhanya", Arrays.asList("Cricket", "Basket Ball"), Arrays.asList(100, 100, 100));
	static Student s3 = new Student(03, "Ramya", Arrays.asList("Swimming", "Basket Ball"), Arrays.asList(80, 90, 95));

	public static Student getStudent(int studentId) {
		
		List<Student> studentList = getStudentList();
		
		for(Student student : studentList) {
			if(studentId == student.getId())
				return student;
		}
		return null;
	}
	public static List<Student> getStudentList() {

		List<Student> studentList = Arrays.asList(s1, s2, s3);
		return studentList;
	}
}
