package core.java.basics;

public class User {

	private int id;
	private String name;
	private int age;

	public User() {
		
		System.out.println("User Instance created via Default Constructor");
	}
	
	public User(int userId, String userName, int age) {

		System.out.println("User Instance created via Parameterized Constructor");
		id = userId;
		name = userName;
		this.age = age;

	}

	public User(String name) {

		System.out.println("Constructor Overloading");
		this.name = name;

	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {

		User user1 = new User();
		user1.setId(1);
		user1.setName("Dhanya");
		user1.setAge(5);
		
		System.out.println("User1 Name: " + user1.getName());
		System.out.println(user1);
		
		User user2 = new User(2, "Mathankumar", 31);
		System.out.println("User2 ID: " + user2.getId());
		
		System.out.println(user2);
		
		User user3 = new User("TestUser");
		System.out.println(user3);
	}
}
