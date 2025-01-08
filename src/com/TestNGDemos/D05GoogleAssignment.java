package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D05GoogleAssignment {
	WebDriver driver;
  @Test
  public void gmailTest() {
	  driver.findElement(By.linkText("Gmail")).click();
	  System.out.println("Title : " +driver.getTitle());
  }
  
  @Test
  public void imagesTest() {
	  driver.findElement(By.linkText("Images")).click();
	  System.out.println("Title : " +driver.getTitle());
  }
  
  @Test
  public void advertisingTest() {
	  driver.findElement(By.linkText("Advertising")).click();
	  System.out.println("Title : " +driver.getTitle());
  }
  
  @Test
  public void businessTest() {
	  driver.findElement(By.linkText("Business")).click();
	  System.out.println("Title : " +driver.getTitle());
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  driver.get("https://www.google.com/");
	  System.out.println("Title : " +driver.getTitle());
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("\t\tTitle: "+driver.getTitle());
		System.out.println("\tAfter Method");
  }

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
