package core.java.advance.domain;

public class User {

	int userId;
	String userName;
	String sex;
	int age;
	
	public User(int userId, String userName, String sex, int age) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.sex = sex;
		this.age = age;
	}

	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", sex=" + sex + ", age=" + age + "]";
	}
	
}
