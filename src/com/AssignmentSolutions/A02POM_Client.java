package com.AssignmentSolutions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class A02POM_Client {
	WebDriver driver;
	SauceDemoLoginPage s1;

	@Test(priority = 2)
	public void verifyLoginTest() {
		s1.verifyLogin("standard_user", "secret_sauce");

	}

	@Test(priority = 1)
	public void verifyTitle() {
		s1.verifyTitle();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");

		s1 = new SauceDemoLoginPage(driver);
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
