package core.java.advance.stream;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import core.java.advance.domain.Student;
import core.java.advance.domain.StudentDB;

import static java.util.stream.Collectors.*;

public class StreamMapExample {

    public static void main(String args[]) {

        List<Student> studentList = new ArrayList<>();
        studentList = StudentDB.getStudentList();

        List<String> namesList = studentList.stream()
                                            .map(Student::getName)
                                            .sorted()
                                            .collect(toList());
        namesList.forEach(System.out::println);

        List<String> activityList = studentList.stream()
                                               .map(Student::getActivities)
                                               .flatMap(List::stream)
                                               .distinct()
                                               .collect(toList());
        activityList.forEach(System.out::println);

        long totalActivities = studentList.stream()
                                          .map(Student::getActivities)
                                          .flatMap(List::stream)
                                          .distinct()
                                          .count();
        System.out.println("totalActivities: " + totalActivities);

        Map<String, OptionalDouble> studentAverageMark = studentList.stream()
                                                                    .collect(toMap(Student::getName, student -> student.getMarks()
                                                                                                                       .stream()
                                                                                                                       .mapToInt(n -> n)
                                                                                                                       .average()));

        studentAverageMark.forEach((key, value) -> System.out.println(key + " " + value.orElse(0)));
    }
}
