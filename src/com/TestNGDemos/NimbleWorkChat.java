package com.TestNGDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NimbleWorkChat {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"kairon-client-container\"]/div//div[2]/div/button/div/img")
	private WebElement imageIcon;

	@FindBy(className = "msgInput-0-3-60")
	private WebElement chatTextField;

	@FindBy(className = "sendIcon-0-3-62")
	private WebElement sendButton;

	public NimbleWorkChat(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public void clickImage() {
		imageIcon.click();
	}

	public void enterChatText(String chat) {
		chatTextField.sendKeys(chat);
	}

	public void sendButton() {
		sendButton.click();
	}

}
