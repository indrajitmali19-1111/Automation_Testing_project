package TESTING1.Selenium_automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Webrowser_to_testing {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		//driver.switchTo().newWindow(WindowType.TAB);
		//DemoQa.com practise form
		driver.get("https://demoqa.com/automation-practice-form");
		
		//one attribute is rong
		driver.findElement(By.xpath("//input[@id='firstName' or @placeholder='first']")).sendKeys("Atharva");
		
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kadam");
		
		driver.findElement(By.xpath("//input[contains(@pattern,'^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$')]")).sendKeys("Athrva@123");
		
		driver.findElement(By.xpath(""))
		
	}

}
