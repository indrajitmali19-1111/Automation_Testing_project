package TESTING1.Selenium_automation1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Indrajeet_automation_Testing\\Selenium_automation1\\DriverResources\\chromedriver.exe");
		System.out.println("Configuration done");
		
		ChromeDriver Driver=new ChromeDriver();
		
		Driver.get("https://chatgpt.com");
		Thread.sleep(10000);
		Driver.close();
	}

}
