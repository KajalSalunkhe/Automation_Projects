package com.AssignmentSolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SauceDemoLoginPage {
	private WebDriver driver;

	@FindBy(id = "user-name") private WebElement userName;
	@FindBy(id = "password") private WebElement password;
	@FindBy(id = "login-button") private WebElement loginButton;


	public SauceDemoLoginPage(WebDriver d) {
		this.driver = d;
		//initElements
		PageFactory.initElements(driver, this);
	}

	public void verifyLogin(String un, String ps) {
		userName.sendKeys(un);
		password.sendKeys(ps);
		loginButton.click();
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"), "Login Failed");
		System.out.println("Login Completed!");
	}

	public void verifyTitle() {
		String actualTitle = driver.getTitle();
		Assert.assertTrue(actualTitle.contains("Labs"), "Title not Matched!");
		System.out.println("Title is Matched : "+actualTitle);
	}
}
