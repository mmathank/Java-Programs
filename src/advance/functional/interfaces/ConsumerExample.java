package core.java.advance.functional.interfaces;

import core.java.advance.domain.Student;
import core.java.advance.domain.StudentDB;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	static Consumer<Student> consumerForNames = student -> System.out.println(student.getName());
	static Consumer<Student> consumerForIds = student -> System.out.println(student.getId());
    public static void main(String[] args) {
        List<Student> studentList = StudentDB.getStudentList();
		studentList.forEach(student -> consumerForNames.andThen(consumerForIds).accept(student));
    }
}
