package com.Assignments;



import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D19ForgotPassword {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dash.bling-center.com/platform/signIn.html");

		WebElement forgotPassowrd = driver.findElement(By.className("forget-password-btn"));
		forgotPassowrd.click();
		
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"email1\"]"));
		userName.sendKeys("test@gmail.com");
		
		WebElement resetBtn = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[2]/button[2]/p"));
		resetBtn.click();
		
		WebElement successMsg = driver.findElement(By.xpath("//*[@id=\"resetsuccess\"]"));
		   System.out.println("Reset success message: " + successMsg.getText());
		
		driver.close();
	}

}
