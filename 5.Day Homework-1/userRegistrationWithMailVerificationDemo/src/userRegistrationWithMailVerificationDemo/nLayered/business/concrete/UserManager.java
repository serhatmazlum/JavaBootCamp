package userRegistrationWithMailVerificationDemo.nLayered.business.concrete;

import java.util.ArrayList;

import java.util.List;
import userRegistrationWithMailVerificationDemo.nLayered.core.abstracts.googleAthService;
import userRegistrationWithMailVerificationDemo.nLayered.business.abstracts.UserService;
import userRegistrationWithMailVerificationDemo.nLayered.business.abstracts.mailValidatorService;
import userRegistrationWithMailVerificationDemo.nLayered.business.abstracts.userVerificationService;
import userRegistrationWithMailVerificationDemo.nLayered.dataAcces.abstracts.UserDao;
import userRegistrationWithMailVerificationDemo.nLayered.entities.concrete.User;
import userRegistrationWithMailVerificationDemo.nLayered.mailService.googleAth;

public class UserManager implements UserService {

//	List<User> users = new ArrayList<>();
	

	private UserDao userDao;
	private googleAthService googleService;
	private mailValidatorService mailValidator;
	private userVerificationService _userVerification;
	private User user;
	
	public  UserManager(UserDao userDao,googleAthService googleService) {
		super();
		this.userDao = userDao;
		this.googleService = googleService;
	
		
		
	}
	
	

	@Override
	public void add(User user) {
		
		if((this.userDao.checkEmail(user.getEmail())!=null)) {
			System.out.println("[USER MANAGER] user is already exist! "+user.getName() +" "+user.getEmail());
		}

		if(!(ifExistMail(user.getEmail()))) {
			System.out.println("[USER MANAGER] email addres invalid! "+user.getEmail());
			
		}
		if(!(_userVerification.isValid(user))) {
			System.out.println("[USER MANAGER] user information is not correct! "+user.getName());
		}
		
		System.out.println("[USER MANAGER] succesfuly added: "+user.getName());
		this.userDao.add(user);

		
		}
	

	@Override
	public void login(String mail, String password) {
		if(!(this.userDao.login(mail, password))) {
			System.out.println("[USER MANAGER] incorrect login information! " + mail+" "+password);
		}
		
		System.out.println("[USER MANAGER] Succesfuly login as "+mail+" "+password );
	}




//	@Override
//	public List<User> get() {
//
//		return  null;		
//	}



	@Override
	public void showList() {
		//this.userDao.stream().forEach(user->System.out.println(user.getEmail()));
		
	}



	@Override
	public boolean ifExistMail(String email) {
	  return  this.googleService.ifExistEmail(email);
		
	}



	@Override
	public List<User> get() {
		// TODO Auto-generated method stub
		return null;
	}




	
	

}
