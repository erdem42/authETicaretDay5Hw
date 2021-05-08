package authenticationETicaretDay5Hw;

import java.util.ArrayList;
import java.util.List;

import authenticationETicaretDay5Hw.business.concretes.UserLoginManager;
import authenticationETicaretDay5Hw.business.concretes.UserRegisterManager;
import authenticationETicaretDay5Hw.core.EmailValidator;
import authenticationETicaretDay5Hw.core.LoginAdapterManager;
import authenticationETicaretDay5Hw.dataAccess.concretes.HibernateUserDao;
import authenticationETicaretDay5Hw.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
	//user created
		User user1=new User("erdem", "yüksek", "e@gmail.com", "123456");
	//user registered	
		UserRegisterManager userRegisterManager=new UserRegisterManager(new EmailValidator(), new HibernateUserDao());
		userRegisterManager.register(user1);
	//user login
		UserLoginManager userLoginManager=new UserLoginManager(new HibernateUserDao(),new LoginAdapterManager());
		userLoginManager.login(user1);
		
		//user login with Google
		userLoginManager.loginWithGoogle();
		
}
}