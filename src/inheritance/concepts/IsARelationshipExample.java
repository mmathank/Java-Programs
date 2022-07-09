package core.java.inheritance.concepts;

public class IsARelationshipExample {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("Mathankumar");
		s1.setSex('M');
		s1.setFlag(true);
		s1.setCourse("Computer Science");
		
		s1.allowAccess(s1.isFlag());
		System.out.println(s1.getCourse());
		
		System.out.println(s1);
	}

}
