package Grouping_Test;

import org.testng.annotations.Test;

public class SignUp_Test {
	
	@Test(groups= {"regression"})
	public void facebooksignup()
	{
		System.out.println("This is regression Test");
	}
	
	
	@Test(groups= {"regression"})
	public void Twittersignup()
	{
		System.out.println("This is regression test for twitter");
	}
	
	
	@Test(groups= {"regression"})
	public void instagramsignup() {
		System.out.println("This is Regression test case for Instagram login");
	}
	
	
	
	
	
}
