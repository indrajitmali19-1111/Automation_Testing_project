package Cross_Browser_Testing;

import org.openqa.selenium.WebDriver;

public interface Opera_Browser {

	static void operabrowser()
	{
		System.setProperty("webdriver.opera.driver", "C:\\Users\\asus\\git\\repository\\Selenium_automation1\\DriverResources\\operadriver.exe");
		WebDriver driver = new OperaDriver();
	}
}
