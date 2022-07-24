package day5hw1.business.abstracts;

import day5hw1.entities.concretes.User;

public interface UserRegistrationService {
	boolean checkFirstName(User user);

	boolean checkLastName(User user);

	boolean checkEmail(User user);

	boolean checkPassword(User user);

	boolean isValidUser(User user);

}
