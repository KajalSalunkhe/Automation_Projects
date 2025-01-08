package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D10LocateByCSSSelectors_SpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement userName = driver.findElement(By.cssSelector("input[autofocus=\"1\"]"));
		userName.sendKeys("test@gmail.com");
		
//		$- end with
		
		WebElement password = driver.findElement(By.cssSelector("input[placeholder$=\"word\"]"));
		password.sendKeys("123456");
		
		
//		^- start with
		WebElement loginBtn = driver.findElement(By.cssSelector("button[id^=\"u_0_5\"]"));
		loginBtn.click();
		
	

	}
}
