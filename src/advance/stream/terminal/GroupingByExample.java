package core.java.advance.stream.terminal;

import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.Map;

import core.java.advance.domain.User;
import core.java.advance.domain.UserDB;

public class GroupingByExample {

	public static void main(String[] args) {

		List<User> userList = UserDB.getUsers();
		Map<String, List<User>> userMapDefaultKey = userList.stream().collect(groupingBy(User::getSex));
		userMapDefaultKey.forEach((key, value) -> System.out.println(key + " " + value));

		Map<String, List<User>> userMapCustomizedKey = userList.stream()
				.collect(groupingBy(user -> user.getAge() > 15 ? "Senior" : "Junior"));
		userMapCustomizedKey.forEach((key, value) -> System.out.println(key + " " + value));

		Map<String, Map<String, List<User>>> userMap = userList.stream()
				.collect(groupingBy(User::getSex, groupingBy(user -> user.getAge() > 15 ? "Senior" : "Junior")));
		userMap.forEach((key,value) -> System.out.println(key + " " + value));
	}
}
