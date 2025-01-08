package com.AssignmentSolutions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A22Revenue_Calculator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.fitpeo.com/revenue-calculator");
		
		driver.findElement(By.xpath("//*[@id=\":R57alklff9da:\"]")).sendKeys(Keys.CONTROL, "A");
		driver.findElement(By.xpath("//*[@id=\":R57alklff9da:\"]")).sendKeys("400");
		
		Thread.sleep(5000);
		driver.close();
	}
}
