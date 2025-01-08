package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03ReadURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		String url = driver.getCurrentUrl();
		
//		if(url.equals("https://www.selenium.dev/"))
		if(url.contains("selenium"))
			System.out.println("Launched correct site\n Test case passed");
		else
			System.out.println("Launched incorrect site\n Test case failed");
		driver.close();

	}

}
