package pagelib;

public class LoginPage {

	private String name = "username";

	private String password = "pwd";

	private String loginButton = "//input[@valign='absmiddle' and @type='submit']";

	private String logOutButton = "//img[@alt='Logout']";

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getLoginButton() {
		return loginButton;
	}

	public String getLogOutButton() {
		return logOutButton;
	}

}
