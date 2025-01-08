package com.Assignments;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A23RediffTable {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		List<WebElement>currentPriceList = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[4]"));
		double[]cpArray = new double[currentPriceList.size()];
		
		for(int i = 0; i < currentPriceList.size(); i++)
		{
			//String p = currentPriceList.get(i).getText();
			//p = p.replace(",", "");
			//cpArray[i] = Double.parseDouble(p);
			cpArray[i] = Double.parseDouble(currentPriceList.get(i).getText().replace(",", ""));
		}
		
		Arrays.sort(cpArray);
		System.out.println("Highst Price: " + cpArray[cpArray.length-1]);
		
		driver.close();
	}

}
