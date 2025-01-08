package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D09LocateByXpath_EchoLogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/");
		
	
		
	WebElement userName=driver.findElement(By.xpath("html/body/div/div/div[2]/div/div[2]/div/div/div/div/form/fieldset/div[2]/fieldset/input"));
	userName.sendKeys("test@gmail.com");
	
	WebElement password = driver.findElement(By.xpath("html/body/div/div/div[2]/div/div[2]/div/div/div/div/form/fieldset/div[2]/fieldset/input[2]"));
	password.sendKeys("123456789");
	
	WebElement subBtn = driver.findElement(By.xpath("html/body/div/div/div[2]/div/div[2]/div/div/div/div/form/fieldset/div[3]/div/input"));
	subBtn.click();
}
}
