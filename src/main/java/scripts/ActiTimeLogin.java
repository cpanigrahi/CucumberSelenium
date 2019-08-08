package scripts;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagelib.LoginPage;
import utillib.Browser;

public class ActiTimeLogin {

	Logger log = LogManager.getLogger(ActiTimeLogin.class);
	LoginPage lpage = new LoginPage();

	@Given("^Launch the appilcation$")
	public void launch_the_appilcation() throws Exception {

		Browser.getBrowser("firefox");

		log.info("Chrome Browser is executed successfully");
	}

	@When("^enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_username_password(String username, String password) throws Exception {

		Browser.driver.findElement(By.name(lpage.getName())).sendKeys(username);

		Browser.driver.findElement(By.name(lpage.getPassword())).sendKeys(password);

		Browser.driver.findElement(By.xpath(lpage.getLoginButton())).click();

		log.info("Application is Logged in Successfully");

	}

	@Then("^Click on Login button$")
	public void click_on_Login_button() throws Exception {

		Browser.driver.findElement(By.xpath(lpage.getLogOutButton())).click();

		log.info("Application is logout successfully");

		Browser.driver.quit();

	}

}
