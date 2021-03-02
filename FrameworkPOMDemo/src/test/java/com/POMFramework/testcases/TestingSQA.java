package com.POMFramework.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.POMFramework.pages.DashBoardPageSQA;
import com.POMFramework.pages.HomePageSQA;
import com.POMFramework.pages.LoginPageSQA;

import utility.BrowserFactory;

public class TestingSQA {
	static WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = BrowserFactory.startBrowser(driver, "Chrome", "https://www.demoqa.com/books");

	}

	// calling methods from respective page
	@Test(priority=1)
	public void homePage() {
		HomePageSQA hp = new HomePageSQA(driver);
		// calling from home page
		hp.homeURL();
		hp.Loginclick();
		driver.close();
	}

	// calling from login page
	@Test(priority=3)
	public void loginPage() {
		
		LoginPageSQA lp = new LoginPageSQA(driver);
		lp.homeURL();
		lp.clickOnLogin();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		lp.userNameclick();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		lp.passWordclick();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		lp.loginButtonClick();
		driver.close();
	}

	// calling from dashboard page
	@Test(priority=3)
	public void dbPage() {
		DashBoardPageSQA dp = new DashBoardPageSQA(driver);
		dp.homeURL();
		dp.typeToSearch();
		dp.clickOnSearch();
		driver.close();

	}

	@AfterMethod
	public void tearDown() {
		// calling logout method
		BrowserFactory.quitBrowser(driver);
	}

}
