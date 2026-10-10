package TESTING1.Selenium_automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Indrajeet_automation_Testing\\Selenium_automation1\\DriverResources\\chromedriver.exe");
		
		ChromeDriver driver=new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://secure.facebook.com/login");
		
		
		//Find the email textbox and fill the email values.
		driver.findElement(By.id("email")).sendKeys("fct@gmail.com");
		
		//Find the password textbox and fill the values.
		driver.findElement(By.id("pass")).sendKeys("12345678");
		
		//Find the login button and click the button.
		driver.findElement(By.id("loginbutton")).click();
		
		
		driver.findElement(By.id(""))
		

	}

}
