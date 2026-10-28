package Stepdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;

public class OrangeHrmclass {
	
	EdgeDriver driver;
	@Given("Luanch the orange hrm website on edgebrowser")
	public void luanch_the_orange_hrm_website_on_edgebrowser() {
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	   
	}

	@When("Enter valid username as {string} and password as {string}")
	public void enter_valid_username_as_and_password_as(String uname, String pass) {
	   
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pass);
		
		
	}

	@And("click on login button of orange hrm website")
	public void click_on_login_button_of_orange_hrm_website() {
		
		driver.findElement(By.tagName("button")).click();
	    
	}

	@Then("User should be login succssfull on orange hrm dashboard")
	public void user_should_be_login_succssfull_on_orange_hrm_dashboard() {
	    
		System.out.println("The user is login successfully and page url is =" + driver.getCurrentUrl());
		
		
		
	}



}
