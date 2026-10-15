package TESTING1.Selenium_automation1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orange_Hrm_login {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		WebElement loginbtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button")));
		loginbtn.click();
		

	}

}
