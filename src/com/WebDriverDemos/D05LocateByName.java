package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D05LocateByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement emailID = driver.findElement(By.name("email"));
		emailID.sendKeys("kajal@gmail.com");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("123456");
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
	}

}
