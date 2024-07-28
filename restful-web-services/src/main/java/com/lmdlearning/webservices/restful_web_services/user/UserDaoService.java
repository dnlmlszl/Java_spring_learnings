package com.lmdlearning.webservices.restful_web_services.user;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;


@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	private static int usersCount = 1000;
	
	static {
		users.add(new User(++usersCount, "LMD79", LocalDate.now().minusYears(25)));
		users.add(new User(++usersCount, "Lajos", LocalDate.now().minusYears(28)));
		users.add(new User(++usersCount, "Devin", LocalDate.now().minusYears(5)));
	}
	
	public List<User> findAll() {
		
		return users;
	}
	
	public User save(User user) {
		
		user.setId(++usersCount);
		
		users.add(user);
		
		return user;
	}
	
	public User findOne(int id) {
		
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	public void deleteById(int id) {
		
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		
		users.removeIf(predicate);
	}

}
