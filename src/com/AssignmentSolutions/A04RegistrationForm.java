package com.AssignmentSolutions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A04RegistrationForm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/automation-practice-form");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(By.id("firstName")).sendKeys("Kajal");
		driver.findElement(By.id("lastName")).sendKeys("Salunkhe");
		driver.findElement(By.id("userEmail")).sendKeys("kajalsalunkhe@gmail.com");
		//driver.findElement(By.id("gender-radio-1")).click();
		js.executeScript("arguments[0].click()", driver.findElement(By.id("gender-radio-2")));
		driver.findElement(By.id("userNumber")).sendKeys("9921457487");
		
		driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.CONTROL + "A");
		driver.findElement(By.id("dateOfBirthInput")).sendKeys("26 Apr 1999");
		
		js.executeScript("window.scrollBy(0, 500)", "");
		
		driver.findElement(By.id("subjectsInput")).sendKeys("H");
		driver.findElement(By.xpath("//*[@id=\"react-select-2-option-0\"]")).click();
		
		//driver.findElement(By.id("hobbies-checkbox-3")).click();
		js.executeScript("arguments[0].click()", driver.findElement(By.id("hobbies-checkbox-3")));
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\KAJAL\\Downloads\\timetable.jpeg");
		
		driver.findElement(By.id("currentAddress")).sendKeys("Pune\nWakad");
		
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0, 500)", "");
		
		driver.findElement(By.xpath("//*[@id=\"state\"]/div[1]/div[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"react-select-3-option-2\"]")).click();
		
		//City
		driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"react-select-4-option-0\"]")).click();
		
		driver.findElement(By.id("submit")).click();
		
		//driver.switchTo().frame(0);
		
		System.out.println(driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]")).getText());
		
		List<WebElement>label = driver.findElements(By.xpath("/html/body/div[5]/div/div/div[2]/div/table/tbody/tr/td[1]"));
		List<WebElement>values = driver.findElements(By.xpath("/html/body/div[5]/div/div/div[2]/div/table/tbody/tr/td[2]"));
		
		for(int i = 0; i < label.size(); i++)
		{
			System.out.print(label.get(i).getText() + "\t : ");
			System.out.print(values.get(i).getText());
			
			System.out.println();
		}
		
		Thread.sleep(5000);
//		driver.close();

	}

}
