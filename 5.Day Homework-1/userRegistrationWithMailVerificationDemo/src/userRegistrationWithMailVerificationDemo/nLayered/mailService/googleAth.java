package userRegistrationWithMailVerificationDemo.nLayered.mailService;

import java.util.ArrayList;
import java.util.List;

import userRegistrationWithMailVerificationDemo.nLayered.entities.concrete.User;

public class googleAth {

	static ArrayList<String> mailList = new ArrayList<String>();
	

	public googleAth() {

		mailList.add("serhat.yek@gmail.com");
		mailList.add("abc@gmail.com");
		mailList.add("serhat@gmail.com");
		mailList.add("xyz@gmail.com");


	}

	public boolean isMatch(String email) {

		boolean check = mailList.contains(email);

		if (!check) {
			System.out.println("goooglec ath. email is not exist " + email);

		} else {
			System.out.println("goooglec ath. valid mail adress "+email);

		}
		return check;

	}

}
