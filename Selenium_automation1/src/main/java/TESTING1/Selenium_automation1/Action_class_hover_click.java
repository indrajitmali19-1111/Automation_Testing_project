package TESTING1.Selenium_automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class_hover_click {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement dybutton = driver.findElement(By.xpath("//button[@onclick='toggleButton(this)']"));
		
		Actions act=new Actions(driver);
		
		//Hover The mouse
		act.moveToElement(dybutton).perform();
		System.out.println("Button is="+dybutton.getText());
		Thread.sleep(2000);
		
		//Single click
		act.click(dybutton).perform();
		System.out.println("Button is="+dybutton.getText());
		
	}

}
