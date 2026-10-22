package Priority_in_TestNg;

import org.testng.annotations.Test;

public class Third_Table {


	@Test(priority=0)
	public void RowOne() {
		System.out.println("The priority is 0");
	}
	
	
	@Test
	public void second() {
		System.out.println("The No priority");
	}
	
	
	@Test(priority=0)
	public void last() {
		System.out.println("The no priority last 0");
	}
	


}
