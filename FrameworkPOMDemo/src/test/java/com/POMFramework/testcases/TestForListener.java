package com.POMFramework.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.POMFramework.testcases.ListenerTest.class)	
public class TestForListener {
	WebDriver driver;
	
	@Test
	public void flipkart() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("snehal");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("snehal15!");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		//String currentURL= driver.getCurrentUrl();
	    //System.out.println(currentURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.close();
	}
	@Test		
	public void TestToFail()				
	{		
	    System.out.println("This method to test fail");					
	    Assert.assertTrue(false);			
	    
	}	
	@Test
	public void reverseString()
	{
		String a= "Synechron Mail";
		for (int i= a.length()-1; i >=0 ; i--) {
			System.out.print(a.charAt(i));
		}
	    
	}   
	
	
	
	}


