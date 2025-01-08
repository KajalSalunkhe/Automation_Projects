package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NimbleAssignment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.nimblework.com/resources/?tx_post_tag=case-studies");
		
		SearchContext ss = driver.findElement(By.xpath("//*[@id=\"kairon-client-container\"]/div")).getShadowRoot();
		ss.findElement(By.cssSelector("button[class=\"ka-button\"]")).click();
	}
}
