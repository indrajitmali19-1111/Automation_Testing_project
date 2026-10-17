package TESTING1.Selenium_automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Iframe_by_Id {

	public static void main(String[] args) {
		

		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("singleframe");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("indramru");
		
	}

}
