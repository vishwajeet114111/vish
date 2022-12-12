package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Test is failed please have a look again", true);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Test is completed sucessfully ", true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{	
		Reporter.log("Test is skipped please retry", true);
	}
		
}
