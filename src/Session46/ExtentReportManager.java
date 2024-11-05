package Session46;

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
	public ExtentSparkReporter sparkReport; //UI of the report
	public ExtentReports extent;//populate common info of the report
	public ExtentTest test;//creating test case entries in the report and update status of the test method
	
	
	 public void onTestStart(ITestResult context)
	 {
		 //specify path of the extent report
		 sparkReport=new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\extentReport.html");
		 sparkReport.config().setDocumentTitle("Automation Report");//title of the report
		 sparkReport.config().setReportName("Fuctional Testing");//name of the report
		 sparkReport.config().setTheme(Theme.DARK);//specified theme of the report
		 
		 extent=new ExtentReports();
		 extent.attachReporter(sparkReport);
		 
		 extent.setSystemInfo("Computer Name", "localhost");
		 extent.setSystemInfo("Enviornment", "QA");
		 extent.setSystemInfo("Tester Name", "Manoj Bhadoriya");
		 extent.setSystemInfo("OS", "Window10");
		 extent.setSystemInfo("Browser Name", "Chrome");
	 }
	 
	 public void onTestSuccess(ITestResult result)
	 {
		 test=extent.createTest(result.getName());//create new entry in the report
	     test.log(Status.PASS, "Test case passed is :"+result.getName());//update status pass/fail/skipped
		  
	 }
	 public  void onTestFailure(ITestResult result)
	 {
		 test=extent.createTest(result.getName());
		 test.log(Status.FAIL, "Test Case fail is :"+result.getName());
		 test.log(Status.FAIL, "Test case fail cause is :"+result.getThrowable());
		 
	 }
	 
	 public void onTestSkipped(ITestResult result)
	 {
		 test=extent.createTest(result.getName());
		 test.log(Status.SKIP, "Test case is skipped :"+result.getName());
		    
	 }
	 
	 public void onFinish(ITestContext context)
	 {
		 		 
		// extent.flush();

	}

	 

	

}
