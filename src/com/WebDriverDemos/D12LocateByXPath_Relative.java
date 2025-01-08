package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D12LocateByXPath_Relative {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
	driver.findElement(By.xpath("//form[@data-testid=\"royal_login_form\"]/div/div/input")).sendKeys("Test@gmail.com");
	driver.findElement(By.xpath("//form[@data-testid=\"royal_login_form\"]/div/div[2]/div/input")).sendKeys("123456789");
//	driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
	driver.findElement(By.xpath("//button[@name=\"login\"]")).sendKeys(Keys.ENTER);
		
	}
	
}
