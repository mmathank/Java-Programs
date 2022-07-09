package core.java.advance.stream;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import core.java.advance.domain.Student;
import core.java.advance.domain.StudentDB;

public class StreamReduceExample {

	public static Optional<Integer> calculateTotalMarks(Predicate<Student> byId) {

		return StudentDB.getStudentList().stream()
				.filter(byId)
				.map(Student::getMarks)
				.flatMap(List::stream)
				.reduce((a, b) -> a + b);
	}
	
	public static int calculateTotalMarksWithOutOptional(Predicate<Student> byName) {

		int total =  StudentDB.getStudentList().stream()
				.filter(byName)
				.map(Student::getMarks)
				.flatMap(List::stream)
				.reduce(0,(a, b) -> a + b);
		
		return total;
	}
	
	public static Optional<Integer> findHighestScore(Predicate<Student> byId) {

		return StudentDB.getStudentList().stream()
				.limit(2)
				.skip(1)
				.filter(byId)
				.map(Student::getMarks)
				.flatMap(List::stream)
				.reduce((a, b) -> a > b ? a : b);
	}
	
	public static int findHighestScoreWithOutOptional(Predicate<Student> byId) {

		return StudentDB.getStudentList().stream()
				.limit(2)
				.filter(byId)
				.map(Student::getMarks)
				.flatMap(List::stream)
				.reduce(0,(a, b) -> a > b ? a : b);
	}

	public static void main(String[] args) {

		Predicate<Student> byId = (student -> student.getId() == 03);
		Predicate<Student> byName = (student -> student.getName().equals("Ramya"));
		System.out.println("Total Marks: " + calculateTotalMarks(byId));
		System.out.println("Total Marks: " + calculateTotalMarksWithOutOptional(byName));
		
		Optional<Integer> highScore = findHighestScore(byId);
		if(highScore.isPresent()) {
			System.out.println("Highest Mark: " + highScore);
		} else {
			System.out.println("Given Student ID is not available in the Stream");
		}
		//Usage of Optional not to display the incorrect/default value as result
		System.out.println("Highest Score: " + findHighestScoreWithOutOptional(byId));
	}

}
