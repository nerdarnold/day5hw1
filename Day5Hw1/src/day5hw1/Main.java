package day5hw1;

import day5hw1.business.abstracts.UserService;
import day5hw1.business.concretes.UserManager;
import day5hw1.business.concretes.UserRegistrationManager;
import day5hw1.dataAccess.concretes.HibernateUserDao;
import day5hw1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "Ata", "Yesilyurt", "nerdarnold@hotmail.com", "65465465");
		User user2 = new User(1, "Zafer", "Altay", "tako@hotmail.com", "6546545");
		UserService manager = new UserManager(new UserRegistrationManager(), new HibernateUserDao());

		manager.signUp(user);
		manager.logIn(user.geteMail(), user.getPassword());
		manager.signUp(user2);
	}

}