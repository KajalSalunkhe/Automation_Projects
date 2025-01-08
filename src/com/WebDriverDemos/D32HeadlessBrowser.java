package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class D32HeadlessBrowser {

	public static void main(String[] args)  {
	ChromeOptions op = new ChromeOptions();
	op.addArguments("--headless");
	WebDriver driver = new ChromeDriver(op);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	System.out.println("Title: " + driver.getTitle());
	
	driver.close();
}
}