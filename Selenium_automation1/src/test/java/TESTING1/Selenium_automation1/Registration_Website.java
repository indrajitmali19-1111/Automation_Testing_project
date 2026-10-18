package TESTING1.Selenium_automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Registration_Website {
	
	 static ChromeDriver driver;
	
	@Test
	void ashow()
	{
		driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/SignIn.html");
	}
	
	@Test
	void crendential()
	{
		driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys("anklesh@gmail.com");
	}
	
	

}
