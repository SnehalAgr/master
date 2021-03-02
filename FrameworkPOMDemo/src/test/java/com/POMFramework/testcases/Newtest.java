package com.POMFramework.testcases;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Newtest {
	WebDriver driver;

	@BeforeMethod
	public void Launch() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Launch Half");
	}

	@Test
	public void Login() {
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//a[text()='register']")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Snehal");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("pwd");
		// driver.findElement(By.xpath("//input[@id='Email']")).sendKeys();
		// driver.findElement(By.xpath("//input[@id='password']")).sendKeys();
		driver.findElement(By.xpath("//button[@id='EMAIL_REG_FORM_SUBMIT']")).click();
		driver.close();
	}

	@AfterMethod
	public void logoutMethod() {
		driver.quit();
	}

}
