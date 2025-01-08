package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03LocateByname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/");

		WebElement username = driver.findElement(By.name("txtCustomerID"));
		username.sendKeys("test@gmail.com");
		
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("123456");
		
		WebElement loginBtn = driver.findElement(By.name("Butsub"));
		loginBtn.click();

	}

}
