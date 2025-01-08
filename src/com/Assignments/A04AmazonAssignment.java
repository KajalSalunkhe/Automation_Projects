package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A04AmazonAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver D = new ChromeDriver();
		D.manage().window().maximize();
		D.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		D.get("https://www.amazon.com/");
		D.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("sams");
		D.findElement(By.xpath("//*[@id=\"nav-flyout-anchor\"]/div[19]/div/div[3]/span[1]")).click();
		Thread.sleep(5000);
		D.findElement(By.xpath("//*[@id=\"nav-flyout-searchAjax\"]/div[2]/div[1]/div[1]/div[1]/div/div[1]")).click();

	}
}
