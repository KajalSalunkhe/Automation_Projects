package com.AssignmentSolutions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A03HandlingDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		WebElement drpList = driver.findElement(By.id("country"));
		Select countries = new Select(drpList);

		System.out.println("Selected Country : " +countries.getFirstSelectedOption().getText());

		List<WebElement> countryList = countries.getOptions();
		System.out.println("\nTotal Countries : " +countryList.size());
		System.out.println("\nAll Countries are following:");

		for(int i=0; i<countryList.size(); i++) {
			System.out.println((i + 1) + ". "  +countryList.get(i).getText());
		}
		countries.selectByVisibleText("United States");
		System.out.println("\nSelected Country: " + countries.getFirstSelectedOption().getText());
	}

}
