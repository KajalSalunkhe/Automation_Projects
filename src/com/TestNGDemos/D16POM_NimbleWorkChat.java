package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class D16POM_NimbleWorkChat {
	private WebDriver driver;
	NimbleWorkChat c1;
	
  @Test
  public void NimbleWorkChat() {
	  c1.clickImage();
	  c1.enterChatText("Hiiii....");
	  c1.sendButton();
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.nimblework.com/resources/?tx_post_tag=case-studies");
	  
	  c1 = new NimbleWorkChat(driver);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
