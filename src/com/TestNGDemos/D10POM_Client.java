package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class D10POM_Client {
	private WebDriver driver;
	RediffCreateAccount r1;
  @Test
  public void createAccount() throws InterruptedException {
	  r1.setFullName("test");
	  r1.setRediffId("test_ph");
	  System.out.println(r1.checkAvailablity());
	  r1.setPassword("Test@123");
	  r1.setConfirmPassword("Test@123");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		r1 = new RediffCreateAccount(driver);
  }

  @AfterTest
  public void afterTest() {
//	  driver.close();
  }

}
