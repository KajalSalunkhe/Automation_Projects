package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D24OrangeHRM {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement username = driver.findElement(By.className("oxd-input"));
		username.sendKeys("admin");

		WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		//		WebElement password = driver.findElement(By.className("oxd-input oxd-input--active"));
		password.sendKeys("admin123");

		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginBtn.click();

		WebElement pim= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));
		pim.click();


		WebElement addBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
		addBtn.click();

		WebElement firstName = driver.findElement(By.cssSelector("input[placeholder=\"First Name\"]"));
		firstName.sendKeys("test");

		WebElement middleName = driver.findElement(By.cssSelector("input[placeholder=\"Middle Name\"]"));
		middleName.sendKeys("test");

		WebElement lastName = driver.findElement(By.cssSelector("input[placeholder=\"Last Name\"]"));
		lastName.sendKeys("test");

		WebElement createLoginBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span"));
		createLoginBtn.click();

		WebElement userName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input"));
		userName.sendKeys("test123");

		WebElement upassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input"));
		upassword.sendKeys("test@123");

		WebElement uCpassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input"));
		uCpassword.sendKeys("test@123");

		WebElement saveBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
		saveBtn.click();

		WebElement pp = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p"));
		pp.click();

		WebElement logOut = driver.findElement(By.linkText("Logout"));
		logOut.click();

		WebElement eXusername = driver.findElement(By.className("oxd-input"));
		eXusername.sendKeys("michel");

		WebElement eXpassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		eXpassword.sendKeys("michel@123");

		WebElement eXloginBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		eXloginBtn.click();

		//		WebElement profileName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		//		System.out.println(profileName.getText());
		System.out.println("Emp Name:"  + driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).getText());

		WebElement myInfo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a/span"));
		myInfo.click();

		//		WebElement empId = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
		//		System.out.println(empId.getAttribute("value"));
		System.out.println("Employee ID:" + driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input")).getAttribute("value"));

		WebElement agpp = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p"));
		agpp.click(); 
		WebElement aglogOut = driver.findElement(By.linkText("Logout"));
		aglogOut.click();
		//		driver.close();

	}
}



