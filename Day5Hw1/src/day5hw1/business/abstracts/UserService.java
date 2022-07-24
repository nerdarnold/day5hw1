package day5hw1.business.abstracts;

import java.util.List;

import day5hw1.entities.concretes.User;

public interface UserService {
	void signUp(User user);

	void logIn(String email, String password);

	List<User> getAll();
}
