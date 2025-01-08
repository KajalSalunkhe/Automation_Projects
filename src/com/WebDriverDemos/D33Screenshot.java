package com.WebDriverDemos;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class D33Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//String fPath = "D:\\StarAgile\\Demos\\SA2409028\\SeleniumAutomationProject\\Screenshots\\JQuerySS.jpeg";
		String fPath = System.getProperty("user.dir")+"\\Screenshots\\JQuerySS_new.jpeg";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/");

		Actions act = new Actions(driver);

		driver.findElement(By.linkText("Droppable")).click();

		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		act.dragAndDrop(source, target).perform();

		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot, new File(fPath));
		System.out.println("Screenshot captured!!!");

		driver.close();
	}

}
