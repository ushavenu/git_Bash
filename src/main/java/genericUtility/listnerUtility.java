package genericUtility;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listnerUtility implements ITestListener,ISuiteListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Executing onTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Executing onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Executing onTestFailuree");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Executing onTestSkipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Executing on onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("executing onTestFailedWithTimeout");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("executing onstart");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("executing on test onfinish");
	}

	@Override
	public void onStart(ISuite suite) {
		System.out.println("executing onStart");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("executing onFinish");
	}

	
	
}
