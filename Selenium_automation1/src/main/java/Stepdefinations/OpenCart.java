package Stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class OpenCart {
	WebDriver driver;
	
	
	@Given("Opnecart website should be launched")
	public void opnecart_website_should_be_launched() {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
	    
	}

	@When("Enter username, firstname, lastname")
	public void enter_username_firstname_lastname() {
	  
	//Username
		
		driver.findElement(By.id("input-username")).sendKeys("Rudra11");
		
	//First name
		
		driver.findElement(By.name("firstname")).sendKeys("Rudra");
		
	//last name
		driver.findElement(By.name("lastname")).sendKeys("Patil");
			
	}

	@And("Enter email , country , password")
	public void enter_email_country_password() {
	  
		//Email 
		
		driver.findElement(By.id("input-email")).sendKeys("rudra111107@gmail.com");
		
		//country
		
		Select country = new Select(driver.findElement(By.name("country_id")));
		
		country.selectByContainsVisibleText("India");
		
		//Password
		driver.findElement(By.id("input-password")).sendKeys("Rudra111107");
		
	}

	@Then("User should create account and register should be successfull")
	public void user_should_create_account_and_register_should_be_successfull() {
		
		driver.findElement(By.xpath("//button[text()='Register']")).click();
	   
	}

	@When("Click on login button")
	public void click_on_login_button() {
		
		WebElement btn=driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[1]"));

		
		Actions act = new Actions(driver);
		
		act.moveToElement(btn).click().perform();
		
		
	    
	}

	@And("Enter Email and password")
	public void enter_email_and_password() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("rudra111107@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Rudra111107");
	  
	}

	@Then("Click on button")
	public void click_on_button() {
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	   
	}



}
