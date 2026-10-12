package TESTING1.Selenium_automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop_down_action {

	public static void main(String[] args) {
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		//Drag
		WebElement drag=driver.findElement(By.id("draggable"));

		//Drop
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		
	}

}
