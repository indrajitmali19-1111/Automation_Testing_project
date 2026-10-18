package TESTING1.Selenium_automation1;

import java.time.Duration;

import org.openqa.selenium.devtools.v147.webmcp.model.Annotation;
import org.openqa.selenium.edge.EdgeDriver;

public class Pegination_Table_task {

	public static void main(String[] args) {
		
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.
	}

}
