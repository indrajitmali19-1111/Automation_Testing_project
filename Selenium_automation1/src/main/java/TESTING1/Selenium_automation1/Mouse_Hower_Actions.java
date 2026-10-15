package TESTING1.Selenium_automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hower_Actions {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement point=driver.findElement(By.xpath("//button[text()='Point Me']"));
		
		//Hover on point me button
		Actions act=new Actions(driver);
		act.moveToElement(point).perform();
		
		//Double click on copy text
		WebElement cpbutton=driver.findElement(By.xpath("//button[contains(@ondblclick,'myFunction1()')]"));
		
		act.doubleClick(cpbutton).perform();
		
		//new tab button click
		WebElement newtab=driver.findElement(By.xpath("//button[text()='New Tab']"));
		act.click(newtab).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ALT+ARROW_LEFT);
		
		//driver.navigate().back();
		
		
	}

}
