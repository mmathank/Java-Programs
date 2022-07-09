package core.java.advance.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class StreamMatchExample {

	public static String validSubjectList(List<String> subjects) {

		if (!subjects.stream().allMatch(new HashSet<>()::add)) {
			return "Invalid - Subject contains duplicate entries";
		} else if (subjects.stream().anyMatch(subject -> subject.equalsIgnoreCase("ALL"))) {
			return "Invalid - Subject ALL is not allowed";
		} else if (subjects.stream().noneMatch(new HashSet<>()::add)) {
			return "No Subject is Matched";
		} else {
			return "Success";
		}
	}

	public static void main(String[] args) {

		List<String> subjects1 = Arrays.asList("Tamil", "Tamil");
		List<String> subjects2 = Arrays.asList("Tamil", "English", "ALL");
		List<String> subjects3 = Arrays.asList("Tamil", "English");
		System.out.println("subjects1: " + validSubjectList(subjects1));
		System.out.println("subjects2: " + validSubjectList(subjects2));
		System.out.println("subjects3: " + validSubjectList(subjects3));
	}
}
