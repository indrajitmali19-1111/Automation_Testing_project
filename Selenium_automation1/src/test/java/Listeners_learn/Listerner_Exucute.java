package Listeners_learn;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


@Listeners(Listeners.HrmLis  tener)
public class Listerner_Exucute {
	public EdgeDriver driver;
	
	
	@Test(priority=0)
	void launch()
	{
		driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=1)
	void verifyLaunch()
	{
		String Expect="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		String Actual=driver.getCurrentUrl();
		
		Assert.assertEquals(Actual, Expect , "The Url is Different");
	}
	
	
	
	

}
