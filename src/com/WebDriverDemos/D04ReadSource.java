package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D04ReadSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		String src = driver.getPageSource();
		
		if(src.contains("selenium"))

			System.out.println("Page source\n test case pass " +src);
		else
			System.out.println("test case failed");
		driver.close();

	}

}
