package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D09LocateByCSSSelectors_Attributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement userName = driver.findElement(By.cssSelector("input[autofocus=\"1\"]"));
		userName.sendKeys("test@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("input[type=\"password\"][name=\"pass\"]"));
		password.sendKeys("123456");
		
		WebElement loginBtn = driver.findElement(By.cssSelector("button[class=\"_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy\"]"));
		loginBtn.click();
		
		

	}

}
