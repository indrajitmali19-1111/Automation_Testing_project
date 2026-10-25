package ExtentReportCreate;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener
{
	public ExtentSparkReporter sparkReporter;  //UI of the report
	public ExtentReports extent;   //Populate common info on the report
	public ExtentTest test;		/*creating test case entries in the report and update status of the test method */
	
	
	@Override
	public void onStart(ITestContext context) {
		
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");   //Specify the location of report 
		
		sparkReporter.config().setDocumentTitle("Automation Report");  //Title or report
		sparkReporter.config().setReportName("Funtional Testing");		//name of the report
		sparkReporter.config().setTheme(Theme.DARK);
		
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
	
		 extent.setSystemInfo("Computer Name", "Localhost");
		 extent.setSystemInfo("Envoironment" , "QA");
		 extent.setSystemInfo("Tester Name" , "Indrajeet");
		 extent.setSystemInfo("OS" , "Window 11");
		 extent.setSystemInfo("Browser Name" , "Chrome");
		 
	}


	@Override
	public void onTestSuccess(ITestResult result) {
		test= extent.createTest(result.getName());  //create a new entry in the report
		test.log(Status.PASS, "Test case PASSED IS:" + result.getName());  //update status p/f/s
	}


	@Override
	public void onTestFailure(ITestResult result) {
		
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case FAILED is :" + result.getName());
		test.log(Status.FAIL , "Test case FAILED cause is:" + result.getThrowable());
	}


	@Override
	public void onTestSkipped(ITestResult result) {
		
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case SKIPPED is :" + result.getName());
	}


	@Override
	public void onFinish(ITestContext context) {
		
		extent.flush();
	}
	
}
