package TESTING1.Selenium_automation1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterize_method_annotation {

	
	@Parameters({"I"})
	@Test
	public void ParaMethod(int num)
	{
		System.out.println(num);
	}
	
}
