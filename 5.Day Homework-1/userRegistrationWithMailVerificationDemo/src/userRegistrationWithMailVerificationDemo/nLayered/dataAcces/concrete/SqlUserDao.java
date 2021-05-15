package userRegistrationWithMailVerificationDemo.nLayered.dataAcces.concrete;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import userRegistrationWithMailVerificationDemo.nLayered.dataAcces.abstracts.UserDao;
import userRegistrationWithMailVerificationDemo.nLayered.entities.concrete.User;

public class SqlUserDao implements UserDao {
	
	List<User> users = new ArrayList<User>();
	

	@Override
	public void add(User user) {
		System.out.println("[DAO] saved Sql DB: "+user.getName()+ " "+user.getLastName());
		users.add(user);		
	}

	@Override
	public User get(int id) {
		User user = users.stream().filter(_user ->_user.getId() == id).findFirst().orElse(null);
		return user;
	}

	@Override
	public List<User> getAll() {
		for(User user:users) {
			System.out.println(user.getName());
		}
		return this.users;
	}

	@Override
	public User checkEmail(String email) {
		User user = users.stream().filter(_user -> _user.getEmail()== email ).findFirst().orElse(null);
		return user;
	}

	@Override
	public boolean login(String email, String password) {
		if( (users.indexOf(email)!=(users.indexOf(password)))){
			return false;
		}
		return true;
		
	
	}
}
