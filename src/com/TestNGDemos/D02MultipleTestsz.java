package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D02MultipleTestsz {
	@Test(priority = 2)
	public void oHRMTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Title: " + driver.getTitle());

		driver.close();
	}
	@Test(priority = 3)
	public void googleTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com/");
		System.out.println("Title: " + driver.getTitle());

		driver.close();
	}
	@Test(priority = 4)
	public void bingTest()  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.bing.com/");
		System.out.println("Title: " + driver.getTitle());

		driver.close();
	}
	@Test (priority = 1)
	public void rediffTest()  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.rediff.com/");
		System.out.println("Title: " + driver.getTitle());

		driver.close();
	}
}
