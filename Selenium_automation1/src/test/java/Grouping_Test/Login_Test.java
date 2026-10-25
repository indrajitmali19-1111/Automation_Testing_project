package Grouping_Test;

import org.testng.annotations.Test;

public class Login_Test {

	@Test(groups= {"Sanity"})
	public void facebooklogin()
	{
		System.out.println("This is Sanity Test");
	}
	
	
	@Test(groups= {"Sanity"})
	public void TwitterLogin()
	{
		System.out.println("This is sanity test for twitter");
	}
	
	
	@Test(groups= {"Sanity"})
	public void instagramlogin() {
		System.out.println("This is Sanity test case for Instagram login");
	}
	
}
