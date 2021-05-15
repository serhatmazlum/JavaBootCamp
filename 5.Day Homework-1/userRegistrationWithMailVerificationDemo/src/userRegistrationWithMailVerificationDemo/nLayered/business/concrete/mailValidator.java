package userRegistrationWithMailVerificationDemo.nLayered.business.concrete;

import java.util.Random;
import userRegistrationWithMailVerificationDemo.nLayered.entities.concrete.User;
import userRegistrationWithMailVerificationDemo.nLayered.business.abstracts.mailValidatorService;
public class mailValidator implements mailValidatorService {
	
	private User user;

	@Override
	public void verificatonMail() {
		System.out.println("verification code for "+user.getEmail()+" : " + this.generateCode());
		
	}
	
	
	public int generateCode() {
		int upperBound = 100;
		int lowerBound = 999;
		Random random = new Random();
		int randomNumber = random.nextInt(upperBound - lowerBound) + lowerBound;	
		return randomNumber;
		
	}
	

}
