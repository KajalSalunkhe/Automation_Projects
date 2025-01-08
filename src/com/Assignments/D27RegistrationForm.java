package com.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D27RegistrationForm {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Kajal");
		
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Salunkhe");
		
		WebElement userEmail = driver.findElement(By.id("userEmail"));
		userEmail.sendKeys("kajal@gmail.com");
		
		WebElement genderF = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));
//		genderF.click();
		js.executeScript("arguments[0].click();", genderF);
//		js.executeScript("arguments[0].click()", driver.findElement(By.id("gender-radio-1")));
		
		WebElement mobileNumber= driver.findElement(By.id("userNumber"));
		mobileNumber.sendKeys("9921457487");
		
		WebElement bDate = driver.findElement(By.id("dateOfBirthInput"));
		bDate.sendKeys(Keys.CONTROL + "A");
		bDate.sendKeys("29 Jan 1979");
		bDate.sendKeys(Keys.ENTER);
		
		WebElement subject = driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
		subject.sendKeys("Hindi");

		// Wait for suggestions to appear
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> suggestions = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
		    By.xpath("//div[contains(@id,'react-select-2-option') and text()='Hindi']")
		));
		
		// Select the first suggestion
		if (!suggestions.isEmpty()) {
		    suggestions.get(0).click();
		} else {
		    System.out.println("No suggestions found for 'Hindi'");
		}
//		js.executeScript("arguments[0].setAttribute('value', 'H')", subject);
//		js.executeScript("arguments[0].value = 'Hindi'; arguments[0].dispatchEvent(new Event('input'));", subject);
//		subject.sendKeys("comp");
//		driver.findElement(By.id("react-select-2-option-0")).click();
		
//		WebElement subJect = driver.findElement(By.id("subjectsInput"));
//		subJect.sendKeys("computer");	
//		subJect.click();

		WebElement chkBox= driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
//		chkBox.click();
		js.executeScript("arguments[0].click();", chkBox);
		

//		js.executeScript("window.scrollBy(0, 500)", "");
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\KAJAL\\Downloads\\timetable.jpeg");
		
		WebElement address = driver.findElement(By.id("currentAddress"));
		address.sendKeys("Pune");
		
		js.executeScript("window.scrollBy(0, 600)", "");		
		driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"react-select-3-option-2\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"react-select-4-option-0\"]")).click();
		
		WebElement subBtn = driver.findElement(By.id("submit"));
		subBtn.click();
		
//		driver.close();
		
				
		
	
	}

}
