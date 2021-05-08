package authenticationETicaretDay5Hw.business.concretes;

import authenticationETicaretDay5Hw.business.abstracts.UserRegisterService;
import authenticationETicaretDay5Hw.core.Validator;
import authenticationETicaretDay5Hw.dataAccess.abstracts.UserDao;
import authenticationETicaretDay5Hw.entities.concretes.User;

public class UserRegisterManager implements UserRegisterService{
	private Validator validator;
	private UserDao userDao;
	
	public UserRegisterManager(Validator validator,UserDao userDao) {
		super();
		this.validator = validator;
		this.userDao=userDao;
	}
	@Override
	public void register(User user) {

		if(user.getPassword().length()<6) {
			System.out.println("Password must be more than 5 characters!");
		return;
		}
		if(!validator.isEmailValid(user.getEmail())) {
			System.out.println("Invalid email!");
			return;
		}
	
		if(userDao.checkIfNewEmail(user)) {
			System.out.println("email used before!");
			return;
		}
		
		if(user.getFirstName().length()<2) {
			System.out.println("First name must be  least 2 characters");
			return;
		}
		if(user.getLastName().length()<2) {
			System.out.println("Last name must be  least 2 characters");
			return;
		}
	
		System.out.println("email sent to user. Login the code. "+user.getFirstName());

		if(userDao.loginCode()) {
				userDao.register(user);
		return;
		}
	}

}
