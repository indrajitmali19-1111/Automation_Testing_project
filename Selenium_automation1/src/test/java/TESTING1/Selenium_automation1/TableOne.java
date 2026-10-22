package TESTING1.Selenium_automation1;

import org.testng.annotations.*;

public class TableOne {

	@Test(priority=-1)
	public void first()
	{
		System.out.println("This is First row");
	}
	
	@Test(priority=0)
	public void second()
	{
		System.out.println("This second method");
	}
	
	@Test(priority=1)
	public void third()
	{
		System.out.println("This is Third method");
	}	
}
