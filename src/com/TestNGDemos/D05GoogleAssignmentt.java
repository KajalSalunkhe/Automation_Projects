package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D05GoogleAssignmentt {
	WebDriver driver;

	@Test (priority = 1, groups = "TopLinks")
	public void gmailLink() {
		driver.findElement(By.partialLinkText("Gmail")).click();
	}
	@Test (priority = 2, groups = "TopLinks")
	public void imagesLink() {
		driver.findElement(By.partialLinkText("Images")).click();
	}
	@Test (priority = 3, groups = "BottomLinks")
	public void advtLink() {
		driver.findElement(By.partialLinkText("Adve")).click();
	}
	@Test (priority = 4, groups = "BottomLinks")
	public void businessLink() {
		driver.findElement(By.partialLinkText("Busine")).click();
	}

	@BeforeMethod(alwaysRun = true)
	public void openGoogle() {
		driver.get("https://google.com");
		System.out.println("Title: " + driver.getTitle());
	}

	@AfterMethod(alwaysRun = true)
	public void printTitle() {
		System.out.println("Title: " + driver.getTitle());
	}

	@BeforeTest(alwaysRun = true)
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest(alwaysRun = true)
	public void afterTest() {
		driver.close();
	}
}
