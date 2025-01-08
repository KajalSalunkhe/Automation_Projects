package com.Assignments;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D23HandlingTable {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.iplt20.com/points-table/men/2024 ");
		
		List<WebElement>teams= driver.findElements(By.xpath("//*[@id=\"pointsdata\"]/tr/td/div/h2"));
	
		System.out.println("Team :");
		for(WebElement t: teams)
			System.out.println(t.getText());
		
      List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"pointsdata\"]/tr/td[12]"));	
     

	     
      System.out.println("Total rows: " + rows.size());
      
      
		
	 System.out.print(rows.get(0).getText());
	

      
//      System.out.println("\nTeam Results:");
      
//      List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"pointsdata\"]/tr/td[12]"));

      
      
//		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"pointsdata\"]/tr"));	
   
      
    

		driver.close();
		
	}

}
