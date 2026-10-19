package TESTING1.Selenium_automation1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class New_annotations {
	
	@AfterMethod
	public void method1()
	{
		System.out.println("This is AfterMethod");
	}

	@Test
	public void method2()
	{
		System.out.println("This is third method ");
		
	}
	
	@AfterMethod
	public void method3()
	{
		System.out.println("This is third method");
	}
}
