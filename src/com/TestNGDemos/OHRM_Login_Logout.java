package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OHRM_Login_Logout {
	WebDriver driver;

	@Test
	public void login1() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public void login2() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("akshay");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("akshay123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public void login3() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public void login4() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("devendra");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("devendra123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@AfterMethod
	public void logout() {
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
	@BeforeTest
	public void launchOHRM() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
