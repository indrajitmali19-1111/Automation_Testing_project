package Stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Gmail {

	@Given("User should be registered")
	public void precondition()
	{
		System.out.println("User is registered!!");
		
	}
	
	@When("Open gmail login page, enter valid credentials")
	public void teststeps()
	{
		
		System.out.println("Email:rudra11@gmail.com & Password:rudra1111");
	}
	
	
	@Then("Gmail login should be successfull")
	public void expectedresult()
	{
		
		System.out.println("Login success");
	}
}
