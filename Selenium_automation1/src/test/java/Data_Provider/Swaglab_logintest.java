package Data_Provider;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Swaglab_logintest {
  @Test(dataProvider = "Data")
  public void Login(String Username, String s) {
	  
	  
	  
  }

  @DataProvider
  public Object[][] Data() {
    return new Object[][] {
      new Object[] { "standard_user", "a" },
      new Object[] { "", "b" },
      new Object[] { "", "b" },
      new Object[] { "", "b" },
      new Object[] { "", "b" },
      new Object[] { "", "b" }, 
    };
  }
}
