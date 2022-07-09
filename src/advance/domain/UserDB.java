package core.java.advance.domain;

import java.util.Arrays;
import java.util.List;

public class UserDB {
	
	static User user01 = new User(01,"Mathankumar","Male",31);
	static User user02 = new User(02,"Dhanya","Female",4);
	static User user03 = new User(03,"Vinoth","Male",30);
	static User user04 = new User(04,"Siva","Male",30);
	static User user05 = new User(05,"Sundar","Male",35);
	static User user06 = new User(06,"Nivin","Male",12);

	public static List<User> getUsers() {
		
		List<User> userList = Arrays.asList(user01,user02,user03,user04,user05,user06);
		return userList;
	}
}
