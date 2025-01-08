package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D06LocateById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement emailID = driver.findElement(By.id("email"));
		emailID.sendKeys("kajal@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("123456");
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
		
		driver.close();
	}

}
