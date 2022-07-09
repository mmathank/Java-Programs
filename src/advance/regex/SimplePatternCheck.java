package core.java.advance.regex;

import java.util.regex.Pattern;

public class SimplePatternCheck {

	public static void main(String[] args) {

		String regex = "(\\w+)(\\W+)(\\d+)";
		String regex2 = "(\\w+)(\\d+)(\\W+)";

		String[] word = { "text@123", "text123@", "text", "text123", "text@" };

		for (String s : word) {
			if (Pattern.matches(regex, s) | Pattern.matches(regex2, s)) {
				System.out.println("Valid Word: " + s);
			} else {
				System.out.println("Invalid Word: " + s);
			}
		}
	}
}
