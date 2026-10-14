package TESTING1.Selenium_automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Keyboard_actions {

	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement search=driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		
		search.sendKeys("Automation Testing");
		
		search.sendKeys(Keys.ENTER);
		
		
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		
		WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		firstname.sendKeys("Prathmesh");
		
		firstname.sendKeys(Keys.CONTROL+"A");
		firstname.sendKeys(Keys.CONTROL+"C");
		
		WebElement lastname=driver.findElement(By.cssSelector("input[ng-model='LastName']"));
		
		lastname.sendKeys(Keys.CONTROL+"V");
		
	}

}
