package userRegistrationWithMailVerificationDemo.nLayered.business.abstracts;

import java.util.List;

import userRegistrationWithMailVerificationDemo.nLayered.entities.concrete.User;

public interface UserService {

	void add(User user);
	void  login(String mail, String password);
	boolean ifExistMail(String email);
	void showList();
	List<User> get();
	
}
