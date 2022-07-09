package core.java.basics;

public class Student {
	
	int rollNo;
	
	public Student(int rollNo) {
		super();
		this.rollNo = rollNo;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollNo;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}


	public static void main(String[] args) {

		Student s1 = new Student(01);
		Student s2 = new Student(01);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1 == s2);
		
		/*String word1 = "JAVA";
		String word2 = "JAVA";
		System.out.println("String Example 1 using constants");
		System.out.println(word1==word2);
		System.out.println(word1.equals(word2));
		
		String word3 = new String("java");
		String word4 = new String("java");
		System.out.println("String Example 2 using String Objects");
		System.out.println(word3==word4);
		System.out.println(word3.equals(word4));*/
	}

}
