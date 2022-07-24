package day5hw1.dataAccess.abstracts;

import java.util.List;

import day5hw1.entities.concretes.User;

public interface UserDao {

	void add(User user);

	void update(User user);

	void delete(User user);

	User getUser(int id);

	List<User> getAll();

}