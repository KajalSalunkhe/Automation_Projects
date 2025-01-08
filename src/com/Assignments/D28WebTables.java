package com.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D28WebTables {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/webtables");

		List<WebElement>headers= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]"));

		System.out.println("Headers :");
		for(WebElement hd: headers)
			System.out.println(hd.getText());

		WebElement addBtn = driver.findElement(By.id("addNewRecordButton"));
		addBtn.click();
		
		driver.findElement(By.id("firstName")).sendKeys("test");
		driver.findElement(By.id("lastName")).sendKeys("test");
		driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");
		driver.findElement(By.id("age")).sendKeys("28");
		driver.findElement(By.id("salary")).sendKeys("80000");
		driver.findElement(By.id("department")).sendKeys("computer");
		driver.findElement(By.id("submit")).click();
		
//		
//		d.	Search the name in First Name column
//		e.	Click on delete button in the same row
//		please give solution
		
//		List<WebElement> fName = driver.

		driver.findElement(By.id("searchBox")).sendKeys("te");
		driver.findElement(By.id("delete-record-1")).click();



	}

}
