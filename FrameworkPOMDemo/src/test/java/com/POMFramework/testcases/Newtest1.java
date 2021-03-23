package com.POMFramework.testcases;
import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Newtest1 {
	WebDriver driver;

	@BeforeMethod
	public void Launch() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Launch Half");
	}
/*
	@Test
	public void Login() {
		driver.get("https://www.lambdatest.com/");
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("apple");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='gh-btn']")).submit();
		Actions act= new Actions(driver);
		act.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//driver.close();
	}	*/
	  
	/*@Test
	public void Logingoogle() {
		driver.get("https://www.google.com/");
		List <WebElement> lis= driver.findElements(By.tagName("a"));
		
		for(int i= 0; i< lis.size(); i++)
		{
			System.out.println(lis.get(i).getText());
		}
		
		//driver.close();
	}*/
	
	/*@Test
	public void getdropdown() {
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Select s = new Select(driver.findElement(By.xpath("//select[@name='country']")));
	      // getting the list of options in the dropdown with getOptions()
	      List <WebElement> op = s.getOptions();
	      int size = op.size();
	      for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         System.out.println(options);
	      }
		//driver.close();
	}*/
	
	/*
	@Test
	public void xpathparent() {
		driver.get("https://www.lambdatest.com/");
		driver.findElement(By.xpath("//li[@class='nav-item']//following-sibling::li//a[text()='Start Free Testing']")).click();
		//driver.findElement(By.xpath("//ul[@class='navbar-nav']//li[@class='nav-item']//a[text()='Log in']")).click();
		String currentURL= driver.getCurrentUrl();
	    System.out.println(currentURL);
		driver.close();
	}*/
	
	
	@Test
	public void flipkart() {
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
		/*
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));*/
				
		driver.close();
	}
	
	@Test
	public void loginToApplicationForDemo()
	{
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("ABCD")).sendKeys("abc");
		driver.findElement(By.xpath("hy")).sendKeys("pawsd");
		driver.findElement(By.xpath("submit")).click();
		String act= driver.getCurrentUrl();
		String exp= "https://www.google.com";
		assertEquals(act, exp);
		
	}

	@AfterMethod
	public void logoutMethod() {
		//driver.quit();
	}

}
