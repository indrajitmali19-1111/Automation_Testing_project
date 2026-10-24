package Assertion;

import org.testng.Assert;
import org.testng.annotations.*;

public class AssertMethodTest {

	
	
	@Test
	public void assertequal()
	{
		//This is assertEqual() method
		
		Assert.assertEquals("Google", 123);   //fail
		//Assert.assertEquals("Google", "Google");  //pass
	}
	
	
	@Test
	public void assertnotequal()
	{
		//This is assertNotEquals() method
		Assert.assertNotEquals("Google", "Google");   //FAil
		//Assert.assertNotEquals("Google", "Go");  //Pass
	}
	
	
	
	@Test
	public void asserttrue()
	{
		//This is asserttrue() method
		Assert.assertTrue(true);  //pass
		
		//Assert.assertTrue(true) ;  //fail
	}
	
	
	
	@Test
	public void assertfalse()//false
	{
		
		//This is asserttrue() method with false value
		Assert.assertFalse(false); //pass
		//Assert.assertFalse(true); //fail
	}
	
	@Test
	public void fail()
	{
		Assert.fail();  //Direct test fail
	}
	
	
}
