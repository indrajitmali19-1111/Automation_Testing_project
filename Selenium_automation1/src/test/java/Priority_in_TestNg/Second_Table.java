package Priority_in_TestNg;

import org.testng.annotations.Test;

public class Second_Table {


		@Test(priority=-1)
		public void RowOne() {
			System.out.println("The priority is-1");
		}
		
		
		@Test(priority=-1)
		public void second() {
			System.out.println("The priority is -1");
		}
		
		
		@Test
		public void last() {
			System.out.println("The no priority");
		}
		
	

}
