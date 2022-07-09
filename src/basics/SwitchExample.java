package core.java.basics;

public class SwitchExample {

	public static void main(String[] args) {

		String day = "Monday";

		switch (day) {

		case "Sunday":
			System.out.println("WeekEnd");
			break;

		case "Monday":
			System.out.println("Week Day");

		case "Tuesday":
			System.out.println("Week Day");
			break;

		default:
			System.out.println("Vacation!");
		}

	}

}
