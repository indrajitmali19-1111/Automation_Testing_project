import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;

public class Practice_1_dataprovider {
  @Test(dataProvider = "login")
  public void f(String name, String pass) {
	  
	  EdgeDriver driver=new EdgeDriver();
	  
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
	  driver.findElement(By.xpath("//*[@id=\'user-name\']")).sendKeys(name);
	  driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pass);
	  driver.findElement(By.xpath("//*[@id=\'login-button\']")).click();
	  
  }

  
  
  
  
  @DataProvider(name="login", indices= {1 , 3})
  public Object[][] LoginData() {
    return new Object[][] {
      new Object[] { "standard_user", "secret_sauce" },
      new Object[] { "locked_out_user", "secret_sauce" },
      new Object[] { "problem_user", "secret_sauce" },
      new Object[] { "performance_glitch_user", "secret_sauce" },
      new Object[] { "error_user", "secret_sauce" },
      new Object[] { "visual_user", "secret_sauce" },
      
    };
  }
}
