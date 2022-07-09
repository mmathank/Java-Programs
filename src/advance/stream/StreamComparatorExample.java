package core.java.advance.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import core.java.advance.domain.Student;
import core.java.advance.domain.StudentDB;

public class StreamComparatorExample {

	//Comparator for Student class to compare it by Name
	Comparator<Student> byName = Comparator.comparing(Student::getName);
	
	
	//Comparator for Student class to compare it by Id
	Comparator<Student> byId = Comparator.comparing(Student::getId);

	public List<Student> sortStudentsByName() {
		return StudentDB.getStudentList().stream().sorted(byName).collect(Collectors.toList());
	}

	public List<Student> sortStudentById(){
		return StudentDB.getStudentList().stream().sorted(byId.reversed())
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		
		StreamComparatorExample sec = new StreamComparatorExample();
		
		List<Student> sortedById = sec.sortStudentById();
		List<Student> sortedByName = sec.sortStudentsByName();
		
		System.out.println("Sorted By Name");
		sortedByName.forEach(System.out::println);
		System.out.println("------------------------------");
		System.out.println("Sorted By ID");
		sortedById.forEach(System.out::println);
	}

}
