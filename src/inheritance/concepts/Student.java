package core.java.inheritance.concepts;

public class Student extends User {
	
	String course;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", flag=" + flag + ", course=" + course + "]";
	}
	
	
}
