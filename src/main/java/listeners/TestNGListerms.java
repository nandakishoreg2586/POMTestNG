package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListerms implements ITestListener {
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test Started :" +result.getName());
	}
	
	
	public void onTestSucess(ITestResult result)
	{
		System.out.println("Test Passed :" +result.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Failed :" +result.getName());
	}
	
	public void onFinish(ITestResult context)
	{
		System.out.println("Test Completed :" +context.getName());
	}
	
	

}
