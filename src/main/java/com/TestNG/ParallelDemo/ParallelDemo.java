package com.TestNG.ParallelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelDemo {
	
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:/ChromeDriver/New/chromedriver.exe");
		
		//create an object of web driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();
				
		//go to the url
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.className("login")).click();
		driver.findElement(By.xpath("//input[@name='email_create']")).sendKeys("shahnajsultana13@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		//Sleep
		Thread.sleep(3000);
		driver.findElement(By.id("id_gender2")).click();

		driver.findElement(By.xpath("//input[@name='customer_firstname']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='customer_lastname']")).sendKeys("Shahnaj");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("123456789");

		driver.findElement(By.id("days")).click();
		Select day = new Select(driver.findElement(By.id("days")));
		day.selectByVisibleText("2  ");
		
		driver.findElement(By.id("months")).click();
		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByVisibleText("August ");
		
		driver.findElement(By.id("years")).click();
		Select year = new Select(driver.findElement(By.id("years")));
		year.selectByVisibleText("1996  ");
		
		driver.findElement(By.id("uniform-newsletter")).click();
		driver.findElement(By.id("uniform-optin")).click();
		//-------giving address----
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(" ");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(" ");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("P.O:1000");
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("banasree");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("dhaka");
		
		driver.findElement(By.id("id_state")).click();
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByVisibleText("Alabama");
		
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("10000");

		driver.findElement(By.id("id_country")).click();
		Select country = new Select(driver.findElement(By.id("id_country")));
		country.selectByVisibleText("United States");

		driver.findElement(By.id("other")).sendKeys("hello");

		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("123456789");

		driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("987456321");
		driver.findElement(By.xpath("//input[@name='alias']")).sendKeys("hi");

		driver.findElement(By.id("submitAccount")).click();
		
	
	
	}
	
}
