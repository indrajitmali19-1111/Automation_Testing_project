package TESTING1.Selenium_automation1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Handeling_WAys {
		
		static ChromeDriver driver;
		
	
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Iframe_Handeling_WAys iframe=new Iframe_Handeling_WAys();
		
		//First method is call
		iframe.ByIndexIframe();
		
		//second method is call
		iframe.ByNameIframe();
		
		}
	
	
	
		void ByIndexIframe() throws InterruptedException
		{
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		//By index switch
		driver.switchTo().frame(0);
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("IndMru");	
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='text']")).clear();
		
		
		}
	
		
		
	void ByNameIframe()
	{
		//By name Switch to iframe
//		WebElement frame=driver.findElement(By.name("SingleFrame"));
//		
//		driver.switchTo().frame(frame);
		
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello Guys");
		
	}

}
