import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class External_File_Reader {

	
	@Test
	
	void fielreadertest() throws IOException
	{
		FileReader fr= new FileReader("C:\\Users\\asus\\git\\repository\\Selenium_automation1\\Base.properties");
	
		Properties pr =new Properties();
		
		pr.load(fr);
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get(pr.getProperty("cravita"));
		
		
	}
}
