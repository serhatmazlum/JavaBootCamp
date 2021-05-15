package userRegistrationWithMailVerificationDemo.nLayered.business.abstracts;

import userRegistrationWithMailVerificationDemo.nLayered.entities.concrete.User;

public interface userVerificationService {

	boolean isValid(User user);
	void verificatonMail();
}
