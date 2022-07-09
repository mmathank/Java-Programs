package core.java.basics;

public class LocalClassExample {

	String name;

	public LocalClassExample(String name) {
		this.name = name;
	}

	public void greet() {

		class Banner {

			String message = "Welcome";

			public String getMessage() {

				return message;
			}
		}

		Banner banner = new Banner();
		String greet = banner.getMessage();
		System.out.println(greet + " " + this.name);
	}

	public static void main(String[] args) {

		new LocalClassExample("Mathankumar").greet();
	}
}
