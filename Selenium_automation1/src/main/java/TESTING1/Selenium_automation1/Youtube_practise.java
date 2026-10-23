package TESTING1.Selenium_automation1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Youtube_practise {

	public static void main(String[] args) throws InterruptedException {
		
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
											
		driver.findElement(By.xpath("//*[@id=\"center\"]/yt-searchbox/div[1]/div/div/form/input")).sendKeys("marathi song");
		driver.findElement(By.xpath("//*[@id=\"center\"]/yt-searchbox/div[1]/div/div/form/input")).sendKeys(Keys.ENTER);
		
		List<WebElement> searchlist=driver.findElements(By.xpath("//*[@id=\'video-title\']"));
		
		
		for(int i=0;i<searchlist.size();i++)
		{
			searchlist.get(i).click();
			Thread.sleep(10000);
			driver.navigate().back();
			Thread.sleep(5000);
			
		}
	
		
		
		
		
	}
}
