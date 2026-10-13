package TESTING1.Selenium_automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_slider_inclass {

	public static void main(String[] args) {
		
		EdgeDriver driver= new  EdgeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		 
		
		WebElement rightslider=driver.findElement(By.xpath("//span[@style='left: 60%;']"));
		
		Actions action= new Actions(driver);
		
		action.dragAndDropBy(rightslider, -50, 0).build().perform();
		
	}

}
