package testnglistners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class d1 implements ITestListener {

	public void onTestSuccess(ITestResult result) {
		System.out.println("sucess");
	}

	public void onTestFailure(ITestResult result) {
	System.out.println("failed");
	}

	public void onStart(ITestContext context) {
	System.out.println("started");
	}

	public void onFinish(ITestContext context) {
		System.out.println("finished ");
	}

	//ITestListener 
	//OnStart, onfinish on test success, on test failure
	//class<=> interface 
	//rightclick=> source=> override/implement metods 
}
