package TESTING1.Selenium_automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration_webpage {
	static ChromeDriver driver;
	
	
	public static void main(String[] args) {
		
		Registration_webpage obj=new Registration_webpage();
		obj.launch();
		obj.entercredentials();
		pressbutton();
	}
	
	
	
	void launch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/SignIn.html");
		
	}

	
	void entercredentials()
	{
		driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys("prathmesh@123");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("prathmesh123");
		
	}
	
	static void pressbutton()
	{
		driver.findElement(By.id("enterbtn")).click();
	}
}
