package userRegistrationWithMailVerificationDemo.nLayered;

import java.util.ArrayList;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//
//import userRegistrationWithMailVerificationDemo.nLayered.business.abstracts.UserService;
//import userRegistrationWithMailVerificationDemo.nLayered.business.concrete.UserManager;
//import userRegistrationWithMailVerificationDemo.nLayered.dataAcces.concrete.SqlUserDao;
//import userRegistrationWithMailVerificationDemo.nLayered.entities.concrete.User;
//import userRegistrationWithMailVerificationDemo.nLayered.mailService.googleAth;

import userRegistrationWithMailVerificationDemo.nLayered.business.abstracts.UserService;
import userRegistrationWithMailVerificationDemo.nLayered.business.concrete.UserManager;
import userRegistrationWithMailVerificationDemo.nLayered.core.concrete.googleAthAdapter;
import userRegistrationWithMailVerificationDemo.nLayered.dataAcces.concrete.SqlUserDao;
import userRegistrationWithMailVerificationDemo.nLayered.entities.concrete.User;
import userRegistrationWithMailVerificationDemo.nLayered.mailService.googleAth;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user1 = new User(
				1,
				"serhat",
				"çetin",
				"serhat.yekmail.com",
				"12345678.S"
				);
		
		User user2 = new User(
				1,
				"mazlum",
				"çetin",
				"serhat.yek@gmail.com",
				"12345678.S"
				);
		

		UserService userManaging = new UserManager(new SqlUserDao(), new googleAthAdapter());
		
		
		userManaging.add(user1);
		
		
		userManaging.login("serhat.yek@gmail.com","12345678.S");
		

		
		
	}

}
