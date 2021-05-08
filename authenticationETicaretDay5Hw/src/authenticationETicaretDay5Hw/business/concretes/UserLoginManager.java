package authenticationETicaretDay5Hw.business.concretes;

import authenticationETicaretDay5Hw.business.abstracts.UserLoginService;
import authenticationETicaretDay5Hw.core.LoginService;
import authenticationETicaretDay5Hw.dataAccess.abstracts.UserDao;
import authenticationETicaretDay5Hw.entities.concretes.User;

public class UserLoginManager implements UserLoginService{
		private UserDao userDao;
		private LoginService loginService;
		
	public UserLoginManager(UserDao userDao,LoginService loginService) {
			super();
			this.userDao = userDao;
			this.loginService=loginService;
		}
	@Override
	public void login(User user) {

		if(userDao.isValidLogin(user)) {
			System.out.println("Logging successfull");
			return;
		}
		System.out.println("Loggin Unsuccessfull");
	}
	@Override
	public void loginWithGoogle() {
		loginService.login();
	
	}
	
	

}
