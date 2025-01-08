package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D08LocateByXpath_GoogleSearch {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(" https://www.google.com");
		
	
		
	WebElement searchBox=driver.findElement(By.xpath("html/body/div/div[3]/form/div/div/div/div/div[2]/textarea"));
	searchBox.sendKeys("cat images");
	searchBox.sendKeys(Keys.ENTER);
	
		
	}

}
