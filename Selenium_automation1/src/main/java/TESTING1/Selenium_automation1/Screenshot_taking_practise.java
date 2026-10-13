package TESTING1.Selenium_automation1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_taking_practise {

	public static void main(String[] args) throws IOException {
		 
		ChromeDriver driver= new ChromeDriver();
		
		//Royal enfield website screenshot take
	/*	
		driver.get("https://www.royalenfield.com/in/en/home");
		driver.manage().window().maximize();
		
		File Take=(File)driver.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\asus\\git\\repository\\Selenium_automation1\\ScreenShots\\RoyalEnfield.png");
		
		Files.copy(Take, Destination);
	*/
		
		//Royal Enfield Gt650 Web Screenshot Take
		driver.navigate().to("https://www.royalenfield.com/in/en/motorcycles/continental-gt/");
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//button[@class='cookie-btn decline']")).click();
		
		File Takes=(File)driver.getScreenshotAs(OutputType.FILE);
		File Desti=new File("C:\\Users\\asus\\git\\repository\\Selenium_automation1\\ScreenShots\\Gt650.png");
		Files.copy(Takes, Desti);
		
	}

}
