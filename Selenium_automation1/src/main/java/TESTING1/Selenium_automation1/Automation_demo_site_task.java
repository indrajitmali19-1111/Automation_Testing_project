package TESTING1.Selenium_automation1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_demo_site_task {

	public static void main(String[] args) {
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//First name
		driver.findElement(By.xpath("//input[contains(@placeholder,'First Name')]")).sendKeys("Aniket");
		
		//last name
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Jadhav");
		
		//Address fill
		driver.findElement(By.cssSelector("textarea")).sendKeys("Bhairav nath mandir, devarde, walawa , sangli, maharashtra, india .");
		
		
		//Email address fill
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("Aniket123");
		
		//Mobile number
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9021556688");
		
		//male/female choose
		driver.findElement(By.cssSelector("input[type='radio'][value='Male']")).click();
		
		
		//Hobbies select Dropdown
		List<WebElement> Hobbies =driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0;i<Hobbies.size();i++)
		{
			Hobbies.get(i).click();
		}
		
		
		//Languages select
		/* driver.findElement(By.xpath("//div[@style='display: block;']")).click();
		Select selelan=new  Select(driver.findElement(By.xpath("//ul[@style='list-style:none;max-height: 230px;overflow: scroll;']")));
		selelan.selectByValue("Hindi");
		*/
		
		//Skills select
		Select skill=new Select(driver.findElement(By.xpath("//select[@id='Skills' and @ng-init='Skill']")));
		skill.selectByContainsVisibleText("Java");
		
		//Country select
		Select country=new Select(driver.findElement(By.xpath("//select[@id='countries' ]")));
		country.selectByValue("India");
		
		//File upload
		driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\asus\\OneDrive\\Documents\\NOTES and Question Banks\\Advance Software testing\\Automation Testing\\Automation_Testing Notes.pdf");
	}

}
