package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class D15POM_Asanaa {
	private WebDriver driver;
	AsanaLoginAccount a1;
	
  @Test
  public void loginAccount()  {
	  a1.clickLogIn();
//	  a1.enterEmailAddress("test@gmail.com");
	  
	  // Wait for the email field to appear
//      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//      wait.until(ExpectedConditions.visibilityOf(a1.getEmailAddressField())); // Update your AsanaLoginAccount with a getter if needed.

      // Enter email address
      a1.enterEmailAddress("test@gmail.com");

      // Validate URL contains "login"
      String currentUrl = driver.getCurrentUrl();
      Assert.assertTrue(currentUrl.contains("login"), "Login failed or page not redirected. Current URL: " + currentUrl);

  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://asana.com/");
		
		a1 = new AsanaLoginAccount(driver);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
