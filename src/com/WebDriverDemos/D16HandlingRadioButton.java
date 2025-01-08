package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D16HandlingRadioButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		
//		WebElement genderF = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]"));
		
		WebElement milk = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[1]"));
		WebElement butter =driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[2]"));
		WebElement cheese =driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[3]"));
		WebElement water =driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[4]"));
		WebElement beer =driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[5]"));
		WebElement wine =driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[6]"));
		
		
		
		
		System.out.println("Before Milk");
		System.out.println("Selected: " + milk.isSelected());
		System.out.println("Enabled : " + milk.isEnabled());
		System.out.println("Visible : " + milk.isDisplayed());
		
		System.out.println("Before Butter");
		System.out.println("Selected: " + butter.isSelected());
		System.out.println("Enabled : " + butter.isEnabled());
		System.out.println("Visible : " + butter.isDisplayed());
		
		System.out.println("Before cheese");
		System.out.println("Selected: " + cheese.isSelected());
		System.out.println("Enabled : " + cheese.isEnabled());
		System.out.println("Visible : " + cheese.isDisplayed());

		System.out.println("Before water");
		System.out.println("Selected: " + water.isSelected());
		System.out.println("Enabled : " + water.isEnabled());
		System.out.println("Visible : " + water.isDisplayed());
		
		System.out.println("Before beer");
		System.out.println("Selected: " + beer.isSelected());
		System.out.println("Enabled : " + beer.isEnabled());
		System.out.println("Visible : " + beer.isDisplayed());
		
		System.out.println("Before wine");
		System.out.println("Selected: " + wine.isSelected());
		System.out.println("Enabled : " + wine.isEnabled());
		System.out.println("Visible : " + wine.isDisplayed());
		
		milk.isSelected();
		butter.isSelected();
		cheese.isSelected();
		water.isSelected();
		beer.isSelected();
		wine.isSelected();
		
		
//		if(milk.isSelected()==false) {
//			milk.click();
//			
//		}
//		if(butter.isSelected()==false) {
//			butter.click();
//		}
//		if(cheese.isSelected()==false) {
//		cheese.click();
//		}
//		if(water.isSelected()==false) {
//		water.click();
//		}
//		if(beer.isSelected()==false) {
//			beer.click();
//		}
//		if(wine.isSelected()==false) {
//		wine.click();
//		}
		
		
		
		System.out.println("\nAfter milk");
		System.out.println("Selected: " + milk.isSelected());
		System.out.println("Enabled : " + milk.isEnabled());
		System.out.println("Visible : " + milk.isDisplayed());
		
		System.out.println("\nAfter butter");
		System.out.println("Selected: " + butter.isSelected());
		System.out.println("Enabled : " + butter.isEnabled());
		System.out.println("Visible : " + butter.isDisplayed());
		
		System.out.println("\nAfter cheese");
		System.out.println("Selected: " + cheese.isSelected());
		System.out.println("Enabled : " + cheese.isEnabled());
		System.out.println("Visible : " + cheese.isDisplayed());
		
		System.out.println("\nAfter water");
		System.out.println("Selected: " + water.isSelected());
		System.out.println("Enabled : " + water.isEnabled());
		System.out.println("Visible : " + water.isDisplayed());
		
		System.out.println("\nAfter beer");
		System.out.println("Selected: " + beer.isSelected());
		System.out.println("Enabled : " + beer.isEnabled());
		System.out.println("Visible : " + beer.isDisplayed());
		
		System.out.println("\nAfter wine");
		System.out.println("Selected: " + wine.isSelected());
		System.out.println("Enabled : " + wine.isEnabled());
		System.out.println("Visible : " + wine.isDisplayed());
	}
}
