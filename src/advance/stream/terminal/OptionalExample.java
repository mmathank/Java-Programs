package core.java.advance.stream.terminal;

import java.util.Optional;

import core.java.advance.domain.Student;
import core.java.advance.domain.StudentDB;

public class OptionalExample {

	public static Optional<Integer> calculateTotalMarks(Student student) {
		
		if(student != null) {
			return student.getMarks().stream().reduce((a, b) -> a + b);
		}
		return Optional.empty();
	}
	
	public static int findHighestMark(Student student) {
		
		if(student != null) {
			return student.getMarks().stream().reduce(0,(a, b) -> a > b ? a : b);
		}
		return 0;
	}

	public static void main(String[] args) {

		Student student01 = StudentDB.getStudent(01);
		Student student100 = StudentDB.getStudent(100);
		
		Optional<Integer> totalMarks = calculateTotalMarks(student01);
		System.out.println(totalMarks.get());

		Optional<Integer> totalMarks2 = calculateTotalMarks(student100);
		
		if (totalMarks2.isPresent()) {
			System.out.println(totalMarks2.get());
		}
		else {
			System.out.println("Given Student ID is not found");
		}
		
		int highScore = findHighestMark(student100);
		System.out.println(highScore);
	}
}
