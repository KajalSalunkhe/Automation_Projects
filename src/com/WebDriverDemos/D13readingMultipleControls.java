package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D13readingMultipleControls {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/");
//		List<WebElement> textBox = driver.findElements(By.cssSelector("input[name^=\"txt\"]"));
//		textBox.get(0).sendKeys("kajal@gmail.com");
//		textBox.get(1).sendKeys("123456789");
//	
		 driver.findElements(By.cssSelector("input[name^=\"txt\"]")).get(0).sendKeys("kajal@gMAIL.COM");
		 driver.findElements(By.cssSelector("input[name^=\"txt\"]")).get(1).sendKeys("123456789");
		 
}

}
