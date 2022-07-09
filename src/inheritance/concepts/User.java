package core.java.inheritance.concepts;

public class User {
	
	String name;
	char sex;
	boolean flag;
	
	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char getSex() {
		return sex;
	}
	
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	public void allowAccess(boolean flag) {
		if(flag) {
			System.out.println("Allowed");
		} else {
			System.out.println("Not Allowed");
		}
	}
}
