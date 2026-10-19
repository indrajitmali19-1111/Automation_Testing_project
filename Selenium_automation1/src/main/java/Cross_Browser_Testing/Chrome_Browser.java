package Cross_Browser_Testing;

import org.openqa.selenium.chrome.ChromeDriver;

public interface Chrome_Browser {

	static void chromebrowser() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.close();
	}
	
}
