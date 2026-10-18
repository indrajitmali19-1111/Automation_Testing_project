package TESTING1.Selenium_automation1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Task {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.partialLinkText("Iframe with in an Iframe")).click();
		
		//Frame one Handle
		WebElement frame1=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(frame1);
		
		//Frame two switch
		
		WebElement frame2=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("I handle this frame");

	}

}
