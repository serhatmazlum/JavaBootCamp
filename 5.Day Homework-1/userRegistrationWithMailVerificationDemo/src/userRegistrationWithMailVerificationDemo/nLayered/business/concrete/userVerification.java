package userRegistrationWithMailVerificationDemo.nLayered.business.concrete;

import java.util.regex.Pattern;

import userRegistrationWithMailVerificationDemo.nLayered.business.abstracts.userVerificationService;
import userRegistrationWithMailVerificationDemo.nLayered.entities.concrete.User;

public class userVerification implements userVerificationService{
	public boolean isValidEmail(String email) {

		String regex = ("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");

		Pattern pattern = Pattern.compile(regex);

		if (email == null) {
			return false;
		}
		return pattern.matcher(email).matches();

	}

	public boolean isValidPassword(String password) {

		if (!(password == null) && (password.length() < 6)) {

			return false;
		}

		return true;
	}

	public boolean isValidName(String name) {

		if (!(name == null && (name.length() < 2))) {

			return false;
		}
		return true;
	}

	public boolean isValidSurName(String surName) {

		if (!(surName == null && (surName.length() < 2))) {

			return false;
		}
		return true;
	}

	@Override
	public boolean isValid(User user) {

		
		if(!(isValidEmail(user.getEmail()))) {
			System.out.println("invalid email");
			return false;
		}
		if(!(isValidPassword(user.getPassword()))) {
			System.out.println("invalid password");
			return false;
		}
		
		if(!(isValidName(user.getName()))){
			System.out.println("invalid name");
			return false;
		}
		if(!(isValidSurName(user.getLastName()))) {
			System.out.println("invalid surname");
			return false;
		}
		return true;
	
	}

	@Override
	public void verificatonMail() {
		// TODO Auto-generated method stub
		
	}

}
