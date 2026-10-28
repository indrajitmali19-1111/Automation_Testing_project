package Assertion;

import org.testng.Assert;
import org.testng.annotations.*;

public class AssertionPractise {
	String ExTitle="Google.com";
	String ActTitle="Google";
	
	@Test
	public void Assertionpract()
	{
		
		
		
		System.out.println("This is i make Fail test case");
		
		//Assertion is used
		Assert.assertEquals(ExTitle, ActTitle);
		
	}
	
	
	@Test
	public void byifelsetitlecheck()
	{
		if(ActTitle.equals(ExTitle))
		{
			System.out.println("The Title is match");
			Assert.assertTrue(true);
		}
		
		else {
			
			System.out.println("The title is not match");
			Assert.assertTrue(false);
		}
		
	}
	
	
}
