package TESTING1.Selenium_automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath_Selector_Practise11 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demoqa.com/register");
		
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Prathmesh");
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Pudhale");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'User')]")).sendKeys("PrathmeshPudhale123");
		
		driver.findElement(By.xpath("//input[@placeholder='Password' and @id='password']")).sendKeys("12344567");
		
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		//driver.findElement(By.xpath("//button[@id='register']")).click();
		//driver.findElement(By.id("register")).click();
		
		
	}

}
