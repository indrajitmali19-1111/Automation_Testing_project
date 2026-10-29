package Priority_in_TestNg;

import org.testng.annotations.Test;

public class Fifth_table {

	@Test(priority=6)
	public void RowOne() {
		System.out.println("The priority is 6");
	}
	
	
	@Test(priority=-6)
	public void second() {
		System.out.println("The priority -6");
	}
	
	
	@Test
	public void last() {
		System.out.println("The no priority");
	}
	
	@Test
	public void secondlast()
	{
		System.out.println("Hello");
	}

}
