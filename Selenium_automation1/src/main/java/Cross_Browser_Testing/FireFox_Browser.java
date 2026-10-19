package Cross_Browser_Testing;

import org.openqa.selenium.firefox.FirefoxDriver;

public interface FireFox_Browser {

	static void Firefoxbroswer() throws InterruptedException
	{
		FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(5000);
		driver.close();		
	}
}
