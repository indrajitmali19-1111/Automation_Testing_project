package TESTING1.Selenium_automation1;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class New_Window_Tab_open {

	public static void main(String[] args) {
		
		//first browser
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.fortunecloudindia.com/");
		System.out.println("The title of website"+driver.getTitle());
		
		
		//For new tab open
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://cravitaindia.com/");
		System.out.println("The title of website"+driver.getTitle());
		
		
		
		//Second browser
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.get("https://www.flipkart.com/");
		System.out.println("The Url of website"+cdriver.getCurrentUrl());
		
		//For new window
		cdriver.switchTo().newWindow(WindowType.WINDOW);
		cdriver.navigate().to("https://www.amazon.in/");
		System.out.println("The Url of website"+cdriver.getCurrentUrl());

		
		

	}

}
