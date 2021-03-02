package com.POMFramework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.BrowserFactory;

public class LoginPageSQA {
	WebDriver driver;

	public LoginPageSQA(WebDriver driver) {
		this.driver = driver;
	}

	public void homeURL() {
		driver = BrowserFactory.startBrowser(driver, "Chrome", "https://www.demoqa.com/books");
	}

	public void clickOnLogin() {
		driver.findElement(By.xpath("//button[@id= 'login']")).click();
	}

	public void userNameclick() {
		driver.findElement(By.xpath("//input[@id= 'userName']")).sendKeys("Snehal");
	}

	public void passWordclick() {
		driver.findElement(By.xpath("//input[@id= 'password']")).sendKeys("Password@123");
	}

	public void loginButtonClick() {
		driver.findElement(By.xpath("//button[@id= 'login']")).click();
	}

}
