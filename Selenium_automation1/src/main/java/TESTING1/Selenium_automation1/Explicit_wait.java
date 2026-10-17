package TESTING1.Selenium_automation1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		
		///Create the object for explicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		//explicit wait apply for username field
		WebElement username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		username.sendKeys("Admin");
		
		
		//Explict wait apply for password field
		WebElement password=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		password.sendKeys("admin123");
		
		//Explicit wait apply for login button
		WebElement loginbtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		loginbtn.click();
		
		
		
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		
		
	}

}
