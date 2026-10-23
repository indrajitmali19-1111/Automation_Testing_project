package Listeners_learn;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class HrmListener implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("The Test case is start");
	}

	
	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("Test script start");
	}

	

}
