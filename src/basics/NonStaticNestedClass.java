package core.java.basics;

public class NonStaticNestedClass {

	String name;

	public NonStaticNestedClass(String name) {
		this.name = name;
	}

	class Banner {

		String message = "Welcome";

		public String getMessage() {

			return message;
		}
	}

	public static void main(String[] args) {

		NonStaticNestedClass nsnc = new NonStaticNestedClass("Mathankumar");
		Banner banner = nsnc.new Banner();
		System.out.println(banner.getMessage() + " " + nsnc.name);
	}
}
