package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class D14LocateByRelativeLocator {

	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
        driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.name("pass"))).sendKeys("test@gmail.com");
      //driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"))).sendKeys("123456");
        
       
	}
}
