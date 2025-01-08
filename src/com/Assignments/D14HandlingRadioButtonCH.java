package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D14HandlingRadioButtonCH {
	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the webpage
        driver.get("https://echoecho.com/htmlforms10.htm");

        // Locate all radio buttons
        WebElement milk = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[1]"));
        WebElement butter = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[2]"));
        WebElement cheese = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[3]"));
        WebElement water = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[4]"));
        WebElement beer = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[5]"));
        WebElement wine = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[6]"));

        // Check status before clicking
        System.out.println("=== Status Before Clicking ===");
        printRadioButtonStatus("Milk", milk);
        printRadioButtonStatus("Butter", butter);
        printRadioButtonStatus("Cheese", cheese);
        printRadioButtonStatus("Water", water);
        printRadioButtonStatus("Beer", beer);
        printRadioButtonStatus("Wine", wine);

        // Click each button and check status
        System.out.println("\n=== Clicking Buttons and Checking Status ===");
        clickAndPrintStatus("Milk", milk);
        clickAndPrintStatus("Butter", butter);
        clickAndPrintStatus("Cheese", cheese);
        clickAndPrintStatus("Water", water);
        clickAndPrintStatus("Beer", beer);
        clickAndPrintStatus("Wine", wine);

        // Close the browser
        driver.quit();
    }

    // Method to print radio button status
    private static void printRadioButtonStatus(String buttonName, WebElement radioButton) {
        System.out.println(buttonName + " Radio Button:");
        System.out.println("  Selected: " + radioButton.isSelected());
        System.out.println("  Enabled : " + radioButton.isEnabled());
        System.out.println("  Visible : " + radioButton.isDisplayed());
    }

    // Method to click a radio button and print status
    private static void clickAndPrintStatus(String buttonName, WebElement radioButton) {
        if (!radioButton.isSelected()) {
            System.out.println(buttonName + " was not selected - Clicking now");
            radioButton.click();
        }
        printRadioButtonStatus(buttonName, radioButton);
    }

}
