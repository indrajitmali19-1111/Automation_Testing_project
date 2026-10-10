package TESTING1.Selenium_automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_entry_form {

	public static void main(String[] args) {
		 
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Rohan");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter EMail' and @id='email']")).sendKeys("ROhan@123");
		
		driver.findElement(By.xpatxpath("//input[@id='textarea' and @class='form-control']h("//input[@id='phone']")).sendKeys("1234567890");
		
		driver.findElement(By.")).sendKeys("Shivaba mala , Devarde , sangli");
		
		

	}

}
