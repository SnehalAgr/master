package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

	public static WebDriver startBrowser(WebDriver driver, String broserName, String url) {
		if ((broserName).equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();

		} else if ((broserName).equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();

		} else if ((broserName).equals("IE")) {
			System.setProperty("webdriver.ie.driver", "./drivers/IEDriver.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("This browser type not supported by appliation");
		}

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);

		return driver;
	}

	public static void quitBrowser(WebDriver driver) {
		driver.quit();

	}

}
