package utillib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static WebDriver driver;

	public static void getBrowser(String browser) {

		if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");

			driver = new FirefoxDriver();

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.manage().window().maximize();

			Browser.driver.get("http://desktop-8d3jj59:90/login.do");

		} else {

			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");

			ChromeOptions options = new ChromeOptions();

			options.addArguments("test-type");

			options.addArguments("start-maximized");

			options.addArguments("--js-flags=--expose-gc");

			options.addArguments("--enable-precise-memory-info");

			options.addArguments("--disable-popup-blocking");

			options.addArguments("--disable-default-apps");

			options.addArguments("--disable-notifications");

			options.addArguments("disable-infobars");

			driver = new ChromeDriver(options);

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.manage().window().maximize();

			Browser.driver.get("http://desktop-8d3jj59:90/login.do");

		}
	}

}