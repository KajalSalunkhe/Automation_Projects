package com.AssignmentSolutions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01Assignment {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		WebElement storeLink = driver.findElement(By.linkText("Store"));
		storeLink.click();

		if(driver.getTitle().contains("Store")) 
			System.out.println("Test Case Passed");
		else
			System.out.println("Test Case Failed");
		driver.close();
	}

}
