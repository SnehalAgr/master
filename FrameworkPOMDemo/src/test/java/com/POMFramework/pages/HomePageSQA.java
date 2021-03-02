package com.POMFramework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.BrowserFactory;

public class HomePageSQA {

	WebDriver driver;

	public HomePageSQA(WebDriver driver) {
		this.driver = driver;
	}

	// Locating to web url
	public void homeURL() {
		driver = BrowserFactory.startBrowser(driver, "Chrome", "https://www.demoqa.com/books");
	}

	// clicking on Login button
	public void Loginclick() {
		driver.findElement(By.xpath("//button[@id= 'login']")).click();
	}

}
