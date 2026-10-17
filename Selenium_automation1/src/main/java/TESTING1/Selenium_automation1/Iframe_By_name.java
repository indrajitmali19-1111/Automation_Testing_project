package TESTING1.Selenium_automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe_By_name {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("SingleFrame");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("HellomMr");

	}

}
