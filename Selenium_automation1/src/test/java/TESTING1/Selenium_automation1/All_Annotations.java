package TESTING1.Selenium_automation1;

//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

public class All_Annotations {

	@AfterTest
	public void method1()
	{
		System.out.println("This Is Aftertest ");
	}
	
	@Test
	public void method2()
	{
		System.out.println("This Is Test");
	}
	
	@BeforeTest
	public void method3()
	{
		System.out.println("This Is BeforeTest ");
		
	}
	
	@AfterSuite
	public void method4()
	{
		System.out.println("Thsi IS AfterSuite");
	}
	
	@BeforeSuite
	public void method5()
	{
		System.out.println("This Is BeforeSuite");
	}
	
	@BeforeMethod
	public void method6()
	{
		System.out.println("This is BeforeMethod");
	}
	
	@AfterMethod
	public void method7()
	{
		System.out.println("This is AfterMethod");
		
	}
	
	@AfterClass
	public void method8()
	{
		System.out.println("This IS AfterClass");
	}
	
	@BeforeClass
	public void method9()
	{
		System.out.println("This is BeforeClass ");
	}
	
	
}
