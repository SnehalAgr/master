package com.POMFramework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.BrowserFactory;

public class DashBoardPageSQA {
	WebDriver driver;

	public DashBoardPageSQA(WebDriver driver) {
		this.driver = driver;
	}
	public void homeURL() {
		driver = BrowserFactory.startBrowser(driver, "Chrome", "https://www.demoqa.com/books");
	}

	public void typeToSearch() {
		driver.findElement(By.id("searchBox")).sendKeys("git");
	}

	public void clickOnSearch() {
		driver.findElement(By.xpath("//span[@id= 'basic-addon2']")).click();
	}
}
