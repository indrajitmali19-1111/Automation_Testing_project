package ListenersPractise;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyOwnListeners implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("This is Onteststart method In listner");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("This is OntestSuccess method In listner");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("This is OntestFailure method In listner");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("This is OntestSkipped method In listner");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
		System.out.println("This is OntestFailedButWithinSuccessPercentage method In listner");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("This is onTestFailedWithTimeout method In listner");
		}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("This is onStart method In listner");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("This is onFinish method In listner");
	}
	
}
