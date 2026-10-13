package TESTING1.Selenium_automation1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox_Task {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://demo.automationtesting.in/Alerts.html");
		 
		 
		 //This Is First Alert Box Handle
		 driver.findElement(By.cssSelector("button[onclick='alertbox()']")).click();
		 Alert aler=driver.switchTo().alert();
		 System.out.println("This Is Alert Box uner Text=" + aler.getText());
		 aler.accept();
		 
		 
		 //This Is Second alert box is Handle
		  driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		 WebElement st= driver.findElement(By.xpath("//button[normalization-space()='click the button to display a confirm box']"));
		st.click();
		  Alert alert1=driver.switchTo().alert();
		  System.out.println("This Is Alert Box uner Text=" + alert1.getText());
		  alert1.accept();
		  
		 // //button[@class='btn btn-primary' and @onclick='confirmbox()']"));
	}

}
