package com.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class D31HandlingMenus {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://istqb.in/");
		
//		Actions act = new Actions(driver);
		
		List<WebElement> menus= driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li"));
		System.out.println(menus.size());
		System.out.println("All Menus: ");
		
		for(WebElement m : menus)
			System.out.println(m.getText());
		
		driver.close();
		
	}

}
