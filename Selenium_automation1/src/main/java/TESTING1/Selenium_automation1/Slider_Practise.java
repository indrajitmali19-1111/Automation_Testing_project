package TESTING1.Selenium_automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Slider_Practise {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		
		//For lest side slider
		WebElement leftslider=driver.findElement(By.xpath("//span[@style='left: 15%;']"));
		
		Actions actio=new Actions(driver);
		actio.dragAndDropBy(leftslider, 60, 0).build().perform();
		
		//For right side slider
		WebElement rightslider=driver.findElement(By.xpath("//span[@style='left: 60%;']"));
		actio.dragAndDropBy(rightslider,-40,0).build().perform();
		Thread.sleep(10000);
		
		driver.close();
		
		
	}

}
