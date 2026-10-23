package Parallel_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Third_class {
WebDriver driver;
	
	@Test
	void chromebrowser()
	{
		driver = new ChromeDriver();
		System.out.println("This is First Test \n" + Thread.currentThread().getId()+"\n");
	}
	
	
	@Test
	void Edgebrowser()
	{
		driver = new EdgeDriver();
		System.out.println("This is Second Test\n" + Thread.currentThread().getId()+"\n");
	}
	
	@Test
	void FirefoxBrowser()
	{
		driver=new FirefoxDriver();
		
		System.out.println("This is third Test\n" + Thread.currentThread().getId()+"\n");
	}
	
}

