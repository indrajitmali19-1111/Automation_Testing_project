package ListenersPractise;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersPractise.MyOwnListeners.class)
public class Practice_Listener {

	@Test(priority = 0)
	public void testcaseone() {
		System.out.println("\nThis is passed test case\n");
	}
	
	@Test (priority= 1)
	public void testcasetwo()
	{
		System.out.println("\nThis is Failed testcase\n");
		
		Assert.fail();
	}
	
	
	
	@Test(priority=2 , dependsOnMethods= {"testcaseone","testcasetwo" } )
	public void testcasethree()
	{
		System.out.println("\n This is Skipped Test case \n");
		
	}
	
	
}
