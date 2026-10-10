package TESTING1.Selenium_automation1;
import org.openqa.selenium.chrome.ChromeDriver;



public class Testing1 {

	public static void main(String[] args) throws InterruptedException
	{
	//1.Set properties of webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Indrajeet_automation_Testing\\Selenium_automation1\\DriverResources\\chromedriver.exe");
		System.out.println("webdriver configuration done.");
		
		
		//2.create the object of chromedriver/intialize chromedriver.
		ChromeDriver driver=new ChromeDriver();
		System.out.println("2. intialize chrome driver");
		
		
		driver.get("https://cravitaindia.com");
		Thread.sleep(10000);
		driver.close();
	}

}
