package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01EchotrakLogin_ClassName {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		WebElement userName = driver.findElement(By.className("form-control"));
		userName.sendKeys("swathi");
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("swathi123");
		WebElement loginBtn = driver.findElement(By.className("btn-block"));
		loginBtn.click();
		
		WebElement errorMessage = driver.findElement(By.id("lblMsg"));
		String msg = errorMessage.getText();
		System.out.println("Error Message: " + msg);
		
		driver.close();
	}
}
