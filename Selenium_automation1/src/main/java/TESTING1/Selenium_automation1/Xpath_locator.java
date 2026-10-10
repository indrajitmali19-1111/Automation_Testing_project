package TESTING1.Selenium_automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_locator {

	public static void main(String[] args) {
		  
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/register");
		driver.manage().window().maximize();
		
		//1.xpath: //tagname[@attribute='value']
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Rohan");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("patil");
		
		//2.xpath://parenttagname/childname
		//driver.findElement(By.xpath("//div/input")).sendKeys("Rohan123");
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='UserName']")).sendKeys("Rohan@123");
		
		//3.xapth://tagname[@attribute='value' and @attribute='value']
		driver.findElement(By.xpath("//input[@id='password' and @class='mr-sm-2 form-control']")).sendKeys("999981");
		
		
		
		
		
		
		
		
	}

}
