package authenticationETicaretDay5Hw.core;

import authenticationETicaretDay5Hw.jLogin.jLoginManager;

public class LoginAdapterManager implements LoginService {

	@Override
	public void login() {

		jLoginManager jLoginManager=new jLoginManager();
		jLoginManager.login();
	}

}
