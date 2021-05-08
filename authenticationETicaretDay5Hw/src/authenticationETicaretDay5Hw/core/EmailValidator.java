package authenticationETicaretDay5Hw.core;

import java.util.regex.Pattern;

public class EmailValidator implements Validator{
	private final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";

	public boolean isEmailValid(String emailInput) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN,
		Pattern.CASE_INSENSITIVE);
		return pattern.matcher(emailInput).find();
		}

}
