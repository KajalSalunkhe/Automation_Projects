package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D06LocateByClass_Facebook {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement username = driver.findElement(By.className("inputtext"));
		username.sendKeys("Kajalsalunkhe26@gmail.com");
		
		WebElement password = driver.findElement(By.className("_9npi"));
		password.sendKeys("123456");
		
		WebElement loginBtn = driver.findElement(By.className("_42ft"));
		loginBtn.click();

	}

}
