package DependencyMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class Method_dependent_practise {
	
	
	
	
	//This is make a fail test login test case because see the how to work depends on method

	public ChromeDriver driver;
	
	@Test
	public void loginHrm() throws Exception 
	{
	driver =new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	//explicit wait
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			
			WebElement loginbtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button")));
			loginbtn.click()
			
	}
	
	
	@Test(dependsOnMethods= {"loginHrm"})
	public void profile()
	{
		System.out.println("The login test is pass");
	}
	
	
	@Test(dependsOnMethods= {"profile" , "loginHrm"})
	public void logout()
	
	{
		System.out.println("this is Depends on profile,login method");
	}
	
	
	
}
