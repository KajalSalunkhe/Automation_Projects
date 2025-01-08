package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A34NimbleWorkChat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.nimblework.com/resources/?tx_post_tag=case-studies");
//		WebElement imageClickButton = driver.findElement(By.xpath("//*[@id=\"kairon-client-container\"]/div//div[2]/div"));
		WebElement element = driver.findElement(By.cssSelector(".ka-button"));
		element.click();
		
System.out.println(element);
	}

}
