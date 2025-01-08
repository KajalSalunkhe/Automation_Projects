package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D05LocateByCssSelectors_SpecialCharacter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
//		The # in CSS selectors is used to target an element by its unique id attribute.
		
		WebElement userName = driver.findElement(By.cssSelector("input#email.inputtext"));
		userName.sendKeys("test@gmail.com");
		
//		selecting elements by their id
		
		WebElement password = driver.findElement(By.cssSelector("input#pass.inputtext"));
		password.sendKeys("123456");
//		
//		WebElement loginBtn = driver.findElement(By.cssSelector("button[id^=\"u_0_5\"]"));
//		loginBtn.click();
			

		WebElement loginBtn = driver.findElement(By.cssSelector("button#loginbutton"));
		loginBtn.click();
		
		

	}
}
