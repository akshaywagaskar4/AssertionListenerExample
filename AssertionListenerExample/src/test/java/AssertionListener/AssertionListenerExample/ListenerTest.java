package AssertionListener.AssertionListenerExample;

import javax.naming.spi.DirStateFactory.Result;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("======Test Started========"+result.getName());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("=======Test passed successfully====="+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("====Test Failed===="+result.getName());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("====Test  Skipped====="+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("=====Test Percentage===="+result.SUCCESS_PERCENTAGE_FAILURE);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("=====Test on start====");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("====Test Finished====");
	}

}
