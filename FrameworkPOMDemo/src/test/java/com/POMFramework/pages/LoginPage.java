package com.POMFramework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.POMFramework.testcases.LoginTestCRM;

public class LoginPage extends LoginTestCRM {
	WebDriver driver;
		
	public LoginPage(WebDriver ldriver)
	{
		this.driver= ldriver;
	}
	
	@FindBy(xpath="//input[@id='username']")WebElement userID;
	@FindBy(xpath="//input[@id='password']")WebElement password;
	@FindBy(xpath="//button[text()='Sign in']")WebElement loginButton;
	
	public void loginToLink(String unOfApp, String passOfApp)
	
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userID.sendKeys(unOfApp);
		password.sendKeys(passOfApp);
		loginButton.click();
	}
}
