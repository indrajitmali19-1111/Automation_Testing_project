package TESTING1.Selenium_automation1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_methods {

	public static void main(String[] args) throws InterruptedException
	{
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Indrajeet_automation_Testing\\Selenium_automation1\\DriverResources\\chromedriver.exe");
		
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.flipkart.com/mobile-phones-store?pageUID=1791432338105");
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		
		String urls=driver.getCurrentUrl();
		System.out.println("The url of Website" + urls );
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
		driver.getTitle();
		driver.navigate().refresh();
		//driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.close();
		
		

	}

}
