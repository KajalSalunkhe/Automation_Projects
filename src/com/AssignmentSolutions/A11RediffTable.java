package com.AssignmentSolutions;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A11RediffTable {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		List<WebElement>price = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[4]"));

		double[] priceArray = new double[price.size()];
		
		for(int i = 0; i < price.size(); i++)
		{
			String p = price.get(i).getText();
			p = p.replace(",", "");
			priceArray[i] = Double.parseDouble(p);
			
			//priceArray[i] = Double.parseDouble(price.get(i).getText().replace(",", ""));
			System.out.println(priceArray[i]);
		}
		
		Arrays.sort(priceArray);
		
		System.out.println("Highest Price: " + priceArray[priceArray.length-1]);
		
		driver.close();
	}
}
