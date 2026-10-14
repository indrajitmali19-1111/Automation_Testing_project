package TESTING1.Selenium_automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Blaze_demo_website_task {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://blazedemo.com/");
		
		driver.manage().window().maximize();
		
		
		//This is first window 
		//Country select toport
		Thread.sleep(1000);
		Select sel=new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		sel.selectByContainsVisibleText("Mexico City");
		
		
		
		
		//country select from
		Thread.sleep(1000);
		Select sel2=new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		sel2.selectByContainsVisibleText("New York");
		
		//Submit button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@value,'Find Flights')]")).click();
		
		
		
		
		//This is second page
		//choose this flight button
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='submit' and @value='Choose This Flight'])[4]")).click();
		
		
		
		
		
		
		//This is third page
		Thread.sleep(1000);
		driver.findElement(By.id("inputName")).sendKeys("Atharva");
		driver.findElement(By.name("address")).sendKeys("Rethare budruk");
		driver.findElement(By.cssSelector("input[placeholder='Anytown']")).sendKeys("Karad");
		driver.findElement(By.cssSelector("#state")).sendKeys("Maharashtra");
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input#zipCode[name='zipCode']")).sendKeys("415409");
		Select card=new Select(driver.findElement(By.id("cardType")));
		card.selectByContainsVisibleText("American Express");
		driver.findElement(By.cssSelector("input[placeholder='Credit Card Number']")).sendKeys("1234 1234 1234");
		driver.findElement(By.id("creditCardMonth")).sendKeys("11");
		driver.findElement(By.cssSelector("#creditCardYear")).sendKeys("2011");
		driver.findElement(By.cssSelector("#nameOnCard")).sendKeys("Atharvasalunkhe");
		driver.findElement(By.cssSelector("#rememberMe")).click();
		Thread.sleep(7000);
		driver.findElement(By.cssSelector("input[value='Purchase Flight']")).click();
		Thread.sleep(10000);
		
	}

}
