package Cross_Browser_Testing;

import org.openqa.selenium.edge.EdgeDriver;

public interface Edge_Browser {

	static void Edgebrowser() throws InterruptedException
	{
		EdgeDriver driver =new EdgeDriver();
		Thread.sleep(5000);
		driver.close();
	}
}
