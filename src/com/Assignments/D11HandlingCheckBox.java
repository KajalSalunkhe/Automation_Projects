package com.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D11HandlingCheckBox {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://echoecho.com/htmlforms09.htm");
		
		List<WebElement> products= driver.findElements(By.cssSelector("input[name^=\"option\"]"));
		

		
//		WebElement milk = driver.findElement(By.cssSelector("input[name=\"option1\"]"));
//		WebElement butter = driver.findElement(By.cssSelector("input[name=\"option2\"]"));
//		WebElement cheese = driver.findElement(By.cssSelector("input[name=\"option3\"]"));
//		System.out.println("Milk Before");
//		System.out.println("milk Selected: "+milk.isSelected());
//		System.out.println("milk Enabled: "+milk.isEnabled());
//		System.out.println("milk Visible: "+milk.isDisplayed());
//		
//		System.out.println("Butter Before");
//		System.out.println("Butter Selected: " +butter.isSelected());
//		System.out.println("Butter Enabled: " +butter.isEnabled());
//		System.out.println("Butter Visible: " +butter.isDisplayed());
//		
//		System.out.println("Cheese Before");
//		System.out.println("Cheese Selected: " +cheese.isSelected());
//		System.out.println("Cheese Enabled: " +cheese.isEnabled());
//		System.out.println("Cheese Visible: " +cheese.isDisplayed());
//		
//		
//
//		
//		if(milk.isSelected()==true)
//			milk.click();
//
////		if i make it true then after not print
//		System.out.println("After");
//		System.out.println("Selected: " +milk.isSelected());
//		System.out.println("Enabled : " +milk.isEnabled());
//		System.out.println("Visible : " +milk.isDisplayed());
//		driver.close();
	}

}
