package Priority_in_TestNg;

import org.testng.annotations.Test;

public class Table_one {

	@Test(priority=-1)
	public void RowOne() {
		System.out.println("The priority is-1");
	}
	
	
	@Test(priority=0)
	public void second() {
		System.out.println("The priority is 0");
	}
	
	
	@Test(priority=1)
	public void last() {
		System.out.println("The priority is1");
	}
	
}
