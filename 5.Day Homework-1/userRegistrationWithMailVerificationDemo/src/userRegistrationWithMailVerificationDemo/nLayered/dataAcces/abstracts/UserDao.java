package userRegistrationWithMailVerificationDemo.nLayered.dataAcces.abstracts;

import java.util.List;

import userRegistrationWithMailVerificationDemo.nLayered.entities.concrete.User;

public interface UserDao {

	
	void add(User user);
	User get(int id);
	List<User> getAll();
	User checkEmail(String email);
	boolean login(String mail, String password);
}
