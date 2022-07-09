package core.java.basics;

public class InitializationOrder {
	
	static {
		System.out.println("Inside Static Block");
	}
	
	{
		System.out.println("Inside Instance Block");
	}
	
	static String name = "Mathan";
	String role = "Developer";

	public static void main(String[] args) {
		System.out.println("name :" + name);
		System.out.println("Hello World");
		
		InitializationOrder io = new InitializationOrder();
		System.out.println("role: " + io.role);
	}

}
