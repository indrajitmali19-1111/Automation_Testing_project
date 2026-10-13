package TESTING1.Selenium_automation1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class Partial_Screenshot_fct_logo {

	public static void main(String[] args) throws IOException {
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://www.fortunecloudindia.com/");
		
		WebElement logoelement=driver.findElement(By.xpath("//img[@alt='FCT Logo - Fortune Cloud Technologies']"));
		
		File logo=(File)logoelement.getScreenshotAs(OutputType.FILE);
		File Desti=new File("C:\\Users\\asus\\git\\repository\\Selenium_automation1\\ScreenShots\\Fctlogo.jpg");
		
		Files.copy(logo, Desti);
	}

}
