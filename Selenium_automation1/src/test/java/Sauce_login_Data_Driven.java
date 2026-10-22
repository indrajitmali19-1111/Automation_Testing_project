import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;

public class Sauce_login_Data_Driven 
{
	
	
  @Test(dataProvider = "Login")
  public void Logintest(String uname, String pass) 
  {
	  
	  EdgeDriver driver =new EdgeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.findElement(By.id("user-name")).sendKeys(uname);
	  driver.findElement(By.id("password")).sendKeys(pass);
	  driver.findElement(By.id("login-button")).click();
	  //System.out.println(driver.getTitle());
  }

  
  
  @DataProvider
  public Object[][] Login() {
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
