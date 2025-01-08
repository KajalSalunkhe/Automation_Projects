package com.TestNGDemos;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D06DataDrivenTesting {

	WebDriver driver;

	@Test(dataProvider = "dp")
	public void f(String un, String ps) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@AfterMethod
	public void afterMethod() {
		if (driver.getCurrentUrl().contains("dashboard")) {
			driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Invalid data");
		}
	}


	@DataProvider
	public Object[][] dp() {
		//	  Object[][]data = new Object[][] {{1, "A"}, {2 , "B"}};
		return new Object[][] {
//			new Object[] { 1, "a" },
//			new Object[] { 2, "b" },
			
			new Object[] { "admin", "admin123" },
			new Object[] { "shikha", "shikha123" },
			new Object[] { "vijaya", "vijaya123" },
			new Object[] { "admin", "admin123"  },
			
		};
	}

	@BeforeTest
	public void beforeTest() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	  
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
