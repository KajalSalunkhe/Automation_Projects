package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D17HandlingDropdownList {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement drpList = driver.findElement(By.id("country"));
		Select countries = new Select(drpList);
		
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
		List<WebElement>countryList = countries.getOptions();
		System.out.println("Total no of Countries: " + countryList.size());
		
		for(int i = 0; i < countryList.size(); i++)
		{
			System.out.println(countryList.get(i).getText());
		}
		
		countries.selectByVisibleText("United States");
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
		//driver.close();
	}

}
