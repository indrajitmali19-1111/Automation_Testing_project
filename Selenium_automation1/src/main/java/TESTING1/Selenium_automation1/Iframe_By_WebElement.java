package TESTING1.Selenium_automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_By_WebElement {

	public static void main(String[] args) {
		
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("https://demo.automationtesting.in/Frames.html");
		 
		 WebElement frame=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		 
		 driver.switchTo().frame(frame);
		 
		 driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Webelement through select");

	}

}
