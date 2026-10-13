package TESTING1.Selenium_automation1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class ScreenShot_Taking {

	public static void main(String[] args) throws IOException {
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		File src=(File)driver.getScreenshotAs(OutputType.FILE);
		 
		File dest=new File("C:\\Users\\asus\\git\\repository\\Selenium_automation1\\ScreenShots\\Flipcart.jpg");
		
		Files.copy(src, dest);
		 
		driver.close();
	}

}
