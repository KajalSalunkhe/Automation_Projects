package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D03Before_After_Test {
	WebDriver driver;

	@BeforeTest
	public void launchTheBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

	@Test(priority = 2)
	public void OHRMTest() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Title : "+ driver.getTitle());
	}
	@Test(priority = 3)
	public void googleTest() {
		driver.get("https://www.google.com/");
		System.out.println("Title : "+ driver.getTitle());
	}
	@Test(priority = 4)
	public void bingTest() {
		driver.get("https://www.bing.com/");
		System.out.println("Title : "+ driver.getTitle());
	}
	@Test(priority = 1)
	public void rediffTest() {
		driver.get("https://www.rediff.com/");
		System.out.println("Title : "+ driver.getTitle());
	}
}

// my output is not getting as per priority.it means it will run as priority but not console getting as per priority
