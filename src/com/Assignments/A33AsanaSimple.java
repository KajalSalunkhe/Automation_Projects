package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A33AsanaSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://asana.com/");
		WebElement logIn = driver.findElement(By.linkText("Log In"));
		logIn.click();
		WebElement emailAddress = driver.findElement(By.id("lui_10"));
		emailAddress.sendKeys("test@gmail.com");

	}

}
