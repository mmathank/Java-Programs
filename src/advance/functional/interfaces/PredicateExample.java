package core.java.advance.functional.interfaces;

import java.util.List;
import java.util.function.Predicate;

import core.java.advance.domain.Student;
import core.java.advance.domain.StudentDB;

public class PredicateExample {

	public static Predicate<Student> idGreaterThanOne = new Predicate<Student>() {
		@Override
		public boolean test(Student student) {
			return student.getId() > 1;
		}
	};

	public static Predicate<Student> idGreaterThanTwo = (student) -> student.getId() > 2;

	public static Predicate<Student> idGreaterThanOneAndTwo = idGreaterThanOne.and(idGreaterThanTwo);

	public static Predicate<String> nameStartsWith = (name) -> name.startsWith("M");

	public static Predicate<List<String>> activityContains = (activity) -> activity.contains("Cricket");

	public static void main(String[] args) {

		List<Student> studentList = StudentDB.getStudentList();

		studentList.forEach((student -> {
			if(idGreaterThanOne.test(student)) {
				System.out.println(student.getId());
			}
		}));

		studentList.forEach((student -> {
			if(idGreaterThanTwo.test(student)) {
				System.out.println(student.getName());
			}
		}));
		
		studentList.forEach((student -> {
			if(idGreaterThanOneAndTwo.test(student)) {
				System.out.println(student.getId() + " " + student.getName());
			}
		}));
		
		studentList.forEach((student -> {
			if(nameStartsWith.test(student.getName())) {
				System.out.println("Name Starts with M: "+ student.getName());
			}
		}));
		
		studentList.forEach((student -> {
			if(activityContains.test(student.getActivities())) {
				System.out.println("Activity Contains Cricket: "+ student.getName() + " " +student.getActivities());
			}
		}));
	}

}
