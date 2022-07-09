package core.java.advance.stream.terminal;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import core.java.advance.domain.User;
import core.java.advance.domain.UserDB;

public class MaxMinByExample {
	
	static Comparator<User> ageComparator = Comparator.comparing(User::getAge);

	public static void main(String[] args) {

		List<User> userList = UserDB.getUsers();
		
		Optional<User> eldestUser = userList.stream().collect(maxBy(ageComparator));
		System.out.println(eldestUser.get());
		
		Optional<User> youngestUser = userList.stream().collect(minBy(ageComparator));
		System.out.println(youngestUser);

	}
}
