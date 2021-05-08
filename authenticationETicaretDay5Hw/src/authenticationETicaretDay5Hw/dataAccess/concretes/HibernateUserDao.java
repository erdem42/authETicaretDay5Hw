package authenticationETicaretDay5Hw.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import authenticationETicaretDay5Hw.dataAccess.abstracts.UserDao;
import authenticationETicaretDay5Hw.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	List<String> userEmails = new ArrayList<>();
	List<String> userPasswords = new ArrayList<>();

	@Override
	public boolean loginCode() {

		return true;
	}

	@Override
	public void register(User user) {

		System.out.println("user registered: " + user.getFirstName());

		userEmails.add(user.getEmail());
		System.out.println("eklendi ");
		userPasswords.add(user.getPassword());

	}

	@Override
	public boolean checkIfNewEmail(User user) {

		return userEmails.contains(user.getEmail());

	}

	@Override
	public boolean isValidLogin(User user) {
		System.out.println(userEmails.size() + " " + userEmails.contains(user.getEmail()));

		return (userEmails.contains(user.getEmail()) && userPasswords.contains(user.getEmail()));

	}

}
