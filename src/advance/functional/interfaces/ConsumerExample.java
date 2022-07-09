package core.java.advance.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import core.java.advance.domain.Student;
import core.java.advance.domain.StudentDB;

public class ConsumerExample {

	static Consumer<Student> student = new Consumer<Student>() {
		@Override
		public void accept(Student student) {
			System.out.print(student.getName() + " ");
		}
	};

	static Consumer<Student> studentActivity = (activity) -> System.out.println(activity.getActivities() + " ");

	static Consumer<Student> nameAndActivity = student.andThen(studentActivity);
	
	static Consumer<Integer> studentId = (id) -> System.out.println(id);
	
	static Consumer<String> names = (name) -> System.out.println(name);

	static Consumer<Integer> power = (n) -> System.out.println(n * n);

	static Consumer<Integer> addTenToN = new Consumer<Integer>() {

		@Override
		public void accept(Integer t) {
			System.out.println(t + 10);
		}

	};

	public static void main(String[] args) {

		List<Student> studentList = StudentDB.getStudentList();
		studentList.forEach(System.out::println);
		
		studentList.forEach(student);
		System.out.println();
		studentList.forEach(studentActivity);
		studentList.forEach(nameAndActivity);
		
		studentList.forEach((student -> studentId.accept(student.getId())));
		studentList.forEach((student -> names.accept(student.getName())));

		System.out.println("----------------------------------------");
		List<Integer> numbers = Arrays.asList(10, 20, 30);
		numbers.forEach(power);

		System.out.println("----------------------------------------");
		for (Integer n : numbers) {
			System.out.println(n * n);
		}

		System.out.println("----------------------------------------");
		numbers.forEach(addTenToN);
		
		System.out.println("----------------------------------------");
		numbers.forEach(power);
		
		System.out.println("----------------------------------------");
		numbers.forEach(power);
		
		System.out.println("----------------------------------------");
		numbers.forEach(power);
		
		
	}
}
