package TESTING1.Selenium_automation1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Mobile Number')]")).sendKeys("418936466464");
		
		driver.findElement(By.xpath("//input[@class='subjects-auto-complete__input']")).sendKeys("Java+Automation testing");
		
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<checkbox.size();i++) {
			checkbox.get(i).click();
		}
		
		
		
		//driver.findElement(By.xpath("div/textarea")).sendKeys("Palus");
		
		driver.findElement(By.xpath("//textarea[starts-with(@placeholder,'Current')]")).sendKeys("Palus , sangli");
	}

}
