package TESTING1.Selenium_automation1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_box_class {

	public static void main(String[] args) throws InterruptedException {
		 
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//1)Simple Alert
		driver.findElement(By.id("alertBtn")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("Alert Box Text is="+alert.getText());
		alert.accept();
		
		Thread.sleep(3000);
		//2)Confirmation alert
		driver.findElement(By.id("confirmBtn")).click();
		Alert alert1=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("The Text Of Confirmation Is=" + alert1.getText());
		alert.dismiss();
		
		Thread.sleep(3000);
		//3)Confirmation alert
		driver.findElement(By.id("promptBtn")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("The alert box text is=="+al.getText());
		al.sendKeys("Hello rohan");
		al.accept();
		
		
	}

}
