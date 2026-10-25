package Grouping_Test;

import org.testng.annotations.Test;

public class Payment_Test {
	
	@Test(groups= {"regression" , "Sanity"})
	public void facebookpayment()
	{
		System.out.println("This is regression and sanity Test");
	}
	
	
	@Test(groups= {"regression" , "Sanity"})
	public void Twitterpayment()
	{
		System.out.println("This is sanity  and regression test for twitter");
	}

}
