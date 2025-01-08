package com.TestNGDemos;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AsanaLoginAccount {
	WebDriver driver;

	@FindBy(linkText = "Log In")  
	private WebElement logInButton;

	//	@FindBy(xpath = "//*[@id=\"lui_8\"]") 
	@FindBy(css = "input[type='email']")
	private WebElement emailAddressField;

	public AsanaLoginAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickLogIn() {
		logInButton.click();
	}

	public void enterEmailAddress(String email) {
		emailAddressField.sendKeys(email);
	}
	public WebElement getEmailAddressField() {
		return emailAddressField;
	}

}
