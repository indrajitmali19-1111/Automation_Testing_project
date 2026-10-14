package TESTING1.Selenium_automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoard_action {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
				
		WebElement google=driver.findElement(By.id("ti6dpd"));
		
		google.sendKeys("Software Testing Tutorial");
		Thread.sleep(4000);
		google.sendKeys(Keys.ENTER);
		
	}

}
