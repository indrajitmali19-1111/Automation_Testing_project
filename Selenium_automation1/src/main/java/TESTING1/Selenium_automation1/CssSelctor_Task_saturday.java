package TESTING1.Selenium_automation1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CssSelctor_Task_saturday {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		
		driver.manage().window().maximize();
		//id tag selector
		//name
		driver.findElement(By.cssSelector("input#name")).sendKeys("Prathmesh");
		
		
		//simple selector
		//email id
		driver.findElement(By.cssSelector("input[placeholder='Enter EMail']")).sendKeys("Prathmesh123");
		
		
		//direct id selector
		//phone number
		driver.findElement(By.cssSelector("#phone")).sendKeys("993355679890");
		
		
		//direct tag name
		//address
		driver.findElement(By.cssSelector("textarea")).sendKeys("Pudhale mala , palus , sangli, maharashtra");
		
		
		//tagname class name
		//male female select
		driver.findElement(By.cssSelector("label.form-check-label")).click();
		
		
		//direct .classname
		//all day select
		List<WebElement> checkbox=driver.findElements(By.cssSelector("input[class='form-check-input'][type='checkbox']"));
		for(int i=0;i<checkbox.size();i++)
		{
			checkbox.get(i).click();
		}
		
		
		
		//id direct
		//select the country in dropdown
		
		Select sel= new Select(driver.findElement(By.cssSelector("#country")));
		sel.selectByContainsVisibleText("India");
		
		//Color Select
		driver.findElement(By.cssSelector("option[value='red']")).click();
		
		
		//Animal Select
		driver.findElement(By.cssSelector("option[value='lion']")).click();
		
		//date pick 1
		driver.findElement(By.cssSelector("#datepicker")).sendKeys("11/11/2026");
		
		
		//date pick 2
		driver.findElement(By.cssSelector("input[readonly='readonly']")).sendKeys("11/11/2027");
		
	}

}
