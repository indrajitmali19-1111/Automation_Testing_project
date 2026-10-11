package TESTING1.Selenium_automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_practise {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		//practicetestautomation.com Tests
		
		
		driver.manage().window().maximize();
		
		//This first site login page
		driver.get("https://practicetestautomation.com/practice-test-login");
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(3000);
		//Next page login
		driver.findElement(By.linkText("Log out")).click();
		
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println("Title of page-" + driver.getTitle());
		
		
		driver.findElement(By.partialLinkText("Log")).click();
		
	}

}
