package core.java.exception.handling;

class InvalidAgeException extends RuntimeException {

	String msg;
	
	public InvalidAgeException(String string) {
		msg = string;
	}

	@Override
	public String toString() {
		return "InvalidAgeException [msg=" + msg + "]";
	}
}

public class ExceptionHandling2 {

	public static void display(int age) {

		if (age < 18) {
			throw new InvalidAgeException("Users must be Adult");
		} else {
			System.out.println("User Registered Successfully!");
		}
			
	}

	public static void main(String[] args) {

		try {
			display(10);
		} catch (InvalidAgeException e) {
			System.out.println(e);
		} finally {
			System.out.println("Always get executed");
		}
	}

}
