package TESTING1.Selenium_automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Mouse_Hower_Actions {

	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement point=driver.findElement(By.xpath("//button[text()='Point Me')]");
		
		
	}

}
