package com.POMFramework.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.POMFramework.pages.LoginPage;

import utility.BrowserFactory;

public class LoginTestCRM {
	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		driver= BrowserFactory.startBrowser(driver, "Chrome", "https://www.linkedin.com/login");
	
	}
	@Test
	public void loginApp()
	{
		LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loginPage.loginToLink("Snehal", "abc123");
		
	}
	@AfterClass
	public void closeApp()
	{
		BrowserFactory.quitBrowser(driver);
	}

}
