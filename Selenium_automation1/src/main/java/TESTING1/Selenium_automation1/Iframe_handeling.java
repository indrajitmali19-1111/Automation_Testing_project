package TESTING1.Selenium_automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_handeling {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pudhale");
		
		driver.findElement(By.className("analystic"));
	
	
	
	}

}
