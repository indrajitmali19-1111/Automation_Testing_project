package Stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class SauceDemologinmultipleuser {
	EdgeDriver driver;
	
	@Given("Launch login page of sauce demo")
	public void launch_login_page_of_sauce_demo() {
	   
		driver= new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		
		
	}

	@When("Enter username as {string} and password as {string}")
	public void enter_username_as_and_password_as(String uname, String pass) {
	    driver.findElement(By.id("user-name")).sendKeys(uname);
	    driver.findElement(By.id("password")).sendKeys(pass);
	}

	@When("click on login button and logout button")
	public void click_on_login_button_and_logout_button() {
	    driver.findElement(By.id("login-button")).click();
	}

	@Then("User should be login and logout successfull and result as {string}")
	public void user_should_be_login_and_logout_successfull_and_result_as(String eresult) throws InterruptedException {
		
		System.out.println("Result is =" + eresult);
		Thread.sleep(3000);
		
		WebElement btn = driver.findElement(By.id("react-burger-menu-btn"));
		Actions act = new Actions(driver);
		
		act.moveToElement(btn).click().perform();
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		
	  	}


	
}
