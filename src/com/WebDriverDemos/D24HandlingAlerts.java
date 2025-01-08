package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D24HandlingAlerts {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/alerts");
		
		Alert alt;			//Reference of Alert interface
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//driver.findElement(By.id("alertButton")).click();
		js.executeScript("arguments[0].click()", driver.findElement(By.id("alertButton")));
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();			//Will click on Ok button
		
		js.executeScript("arguments[0].click()", driver.findElement(By.id("timerAlertButton")));
		//Thread.sleep(5000);
		//alt = driver.switchTo().alert();
		alt = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alt.getText());
		alt.accept();
		
		js.executeScript("window.scrollBy(0, 400)", "");
		driver.findElement(By.id("confirmButton")).click();
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();			//Click on Cancle button
		
		driver.findElement(By.id("promtButton")).click();
		alt = driver.switchTo().alert();
		alt.sendKeys("Swathi");
		alt.accept();
	}

}
