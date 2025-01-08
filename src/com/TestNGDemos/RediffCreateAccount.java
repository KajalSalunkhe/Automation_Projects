package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.TestNGDemos.D10POM_Client.driver;
public class RediffCreateAccount {
	// utility cls;
	WebDriver driver;

	//	page factory - is a collection of controls those are used for multiple timea
	//	you can call it as an object repository

	@FindBy (css = "input[maxlength=\"61\"]") private WebElement fullNametxtBox;
	@FindBy (xpath = "/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[1]") 
	private WebElement rediffId;

	public RediffCreateAccount(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver, this);
	}

	public void setFullName(String fullName)
	{
		//		driver.findElement(By.cssSelector("input[maxlength=\"61\"]")).sendKeys(fullName);;
		fullNametxtBox.sendKeys(fullName);
	}
	public void setRediffId(String id) {
		//		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[1]")).sendKeys(id);
		rediffId.sendKeys(id);
	}

	public void setPassword(String pass) {
		driver.findElement(By.id("newpasswd")).sendKeys(pass);
	}

	public void setConfirmPassword(String pass) {
		driver.findElement(By.id("newpasswd1")).sendKeys(pass);
	}
	public String checkAvailablity() throws InterruptedException  
	{
		driver.findElement(By.className("btn_checkavail")).click();
		Thread.sleep(2000);
		return(driver.findElement(By.xpath("//*[@id=\"check_availability\"]/font"))).getText();
	}
}
