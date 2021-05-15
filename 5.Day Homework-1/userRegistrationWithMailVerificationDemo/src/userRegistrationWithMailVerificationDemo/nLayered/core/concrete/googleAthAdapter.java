package userRegistrationWithMailVerificationDemo.nLayered.core.concrete;

import userRegistrationWithMailVerificationDemo.nLayered.core.abstracts.googleAthService;
import userRegistrationWithMailVerificationDemo.nLayered.mailService.googleAth;

public class googleAthAdapter implements googleAthService{

	@Override
	public boolean ifExistEmail(String email) {
		
		googleAth googleCheckMail = new googleAth();
		return googleCheckMail.isMatch(email);
	}

}
