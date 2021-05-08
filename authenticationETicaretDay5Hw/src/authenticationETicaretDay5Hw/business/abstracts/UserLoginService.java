package authenticationETicaretDay5Hw.business.abstracts;

import authenticationETicaretDay5Hw.entities.concretes.User;

public interface UserLoginService {
	void login(User user);
	void loginWithGoogle();
}
