package core.java.advance.functional.interfaces;

import java.util.Arrays;
import java.util.function.Supplier;

import core.java.advance.domain.Student;

public class SupplierExample {
	
	public static Supplier<Student> student = () -> {
		return new Student(04,"Student_04",Arrays.asList("Cycling","Cricket"),Arrays.asList(90,80,70));
	};

	public static void main(String[] args) {

		System.out.println(student.get());
	}

}
