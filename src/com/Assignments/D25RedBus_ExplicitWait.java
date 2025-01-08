package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D25RedBus_ExplicitWait {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		
		driver.findElement(By.id("src")).sendKeys("Kolh");
		WebElement from = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[1]/div/div[1]/ul/li[1]/div/text")));
        from.click();
		
		//To
		driver.findElement(By.id("dest")).sendKeys("Ban");
		
		 WebElement to = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[3]/div[1]/ul/li[1]/div/text")));
	        to.click();
		
		//Calender
//		driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/i")).click();
	        WebElement calendarIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"onwardCal\"]/div/i")));
	        calendarIcon.click();
	        WebElement date = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[6]/span[1]/div[6]/span[1]")));
	        date.click();
//		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[6]/span[1]/div[6]/span[1]")).click();
		
		//Search Bus
//		driver.findElement(By.id("search_button")).click();
	        
	        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("search_button")));
	        searchButton.click();
		
	        
	        // Wait for the result to be visible and display the result text
	        WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"13872137\"]/div/div[1]/div[1]/div[1]/div[1]")));
	        System.out.println(result.getText());
		//Display result
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"13872137\"]/div/div[1]/div[1]/div[1]/div[1]")).getText());
		
		driver.close();
	
	}

}
