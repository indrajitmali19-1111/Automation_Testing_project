package TESTING1.Selenium_automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Blaze_demo_website_task {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://blazedemo.com/");
		
		driver.manage().window().maximize();
		
		Select sel=new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		sel.selectByContainsVisibleText("Paris");

	}

}
