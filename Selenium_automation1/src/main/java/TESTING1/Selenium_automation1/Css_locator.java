package TESTING1.Selenium_automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Css_locator {

	public static void main(String[] args) {

		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com");
		

		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Rohan");
		
		//driver.findElement(By.cssSelector("//input[contains(placeholder,'Enter EMail']")).sendKeys("ROhan@123");
		
		//driver.findElement(By.cssSelector("input#phone")).sendKeys("1234567890");
		
		//driver.findElement(By.cssSelector("input)).sendKeys("Shivaba mala , Devarde , sangli");
		
		Select sel = new Select(driver.findElement(By.id("country")));
		
		sel.selectByContainsVisibleText("India");
	
	}

}
