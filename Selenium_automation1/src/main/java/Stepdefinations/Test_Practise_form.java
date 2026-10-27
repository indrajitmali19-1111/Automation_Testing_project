package Stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Practise_form {

	@Given("Practise form should launch")
	public void launch()
	{
		System.out.println("Launch practise form");
	}
	
	
	@When("enter name , surname and email")
	public void enterdata()
	{
		System.out.println("Enter data");
		
	}
	
	@Then ("name , surname and email should inserted successfull.")
	public void verifyinserted_data()
	{
		System.out.println("Verify data inserted");
	}
	
	
	
}
