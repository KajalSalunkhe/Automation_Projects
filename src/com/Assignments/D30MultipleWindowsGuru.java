package com.Assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D30MultipleWindowsGuru {


	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.guru99.com/popup.php");

		driver.findElement(By.linkText("Click Here")).click();

		System.out.println("Title: " + driver.getTitle());
		Set<String>windows = driver.getWindowHandles();

		Iterator<String> itr = windows.iterator();
		String win1= itr.next();
		String win2 = itr.next();

		driver.switchTo().window(win2);
		System.out.println("Title: " + driver.getTitle());

		driver.findElement(By.cssSelector("input[name=\"emailid\"]")).sendKeys("test@gmail.com");
		driver.findElement(By.cssSelector("input[name=\"btnLogin\"]")).click();

		System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[4]")).getText());	
		
		System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[5]")).getText());
		
		driver.switchTo().window(win1);	
		
		driver.quit();
	}
}
