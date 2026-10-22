package Priority_in_TestNg;

import org.testng.annotations.Test;

public class Fourth_Table {


	@Test(priority=2)
	public void RowOne() {
		System.out.println("The priority is 2");
	}
	
	
	@Test(priority=0)
	public void second() {
		System.out.println("The no priority 0");
	}
	
	
	@Test(priority=3)
	public void last() {
		System.out.println("The no priority 3");
	}
	


}
