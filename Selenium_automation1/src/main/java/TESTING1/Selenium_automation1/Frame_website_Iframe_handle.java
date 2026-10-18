package TESTING1.Selenium_automation1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_website_Iframe_handle {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		
		//Frame one
		WebElement frame=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hello");
		//Switch to direct main page
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		
		//Frame two Switch 
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.name("mytext2")).sendKeys("This frame two");
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		
		
		//Frame three and Inner iframe
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("This is frame three");
		
		WebElement innerframe=driver.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/e/1FAIpQLSf5WiH3jEQApYku0Rl_nreU6_YMuLKAH5ffHuASyykQSIBjmg/viewform?embedded=true']"));
		driver.switchTo().frame(innerframe);
		driver.findElement(By.xpath("//div[@class='rseUEf nQOrEb']")).click();
		

	}

}
