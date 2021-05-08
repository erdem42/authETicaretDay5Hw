package authenticationETicaretDay5Hw.dataAccess.abstracts;

import authenticationETicaretDay5Hw.entities.concretes.User;

public interface UserDao {
	boolean loginCode();
	void register(User user);
	boolean checkIfNewEmail(User user);
	boolean isValidLogin(User user);

}
