package ExtentReportCreate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeHrm_Login {

	WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException
	{
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}
	
	
	@Test(priority= 1)
	public void Testlogo()
	{
		boolean status  = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		
		Assert.assertEquals(status, true);
	}
	
	
	@Test(priority= 2)
	public void testAppurl()
	{
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/");
	}
	
	

	@Test(priority= 3 , dependsOnMethods = {"testAppurl"})
	public void testHomePageTitle()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
