package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D04LocateByClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/");
		
		WebElement username = driver.findElement(By.className("form-control"));
		username.sendKeys("test@gmail.com");
		
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("123456");
		
		WebElement loginBtn = driver.findElement(By.className("btn-primary"));
		loginBtn.click();

	}

}
