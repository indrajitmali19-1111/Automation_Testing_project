package TESTING1.Selenium_automation1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test_Annotations {

	
	@AfterTest
	public void name() {
		System.out.println("Indra");
	}
	
	
	
	@Test
	public void Email() {
		System.out.println("Indra@gmail.com");
	}
	
	@AfterTest
	public void Surname()
	{
		System.out.println("Mali");
	}
}
