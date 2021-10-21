package MyTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Sept30_Listeners implements ITestListener{
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
		//Reporter.log("OnStart");
		System.out.println("OnStart");
	}
	  
	  @Override
		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			ITestListener.super.onFinish(context);
			//Reporter.log("OnFinish");
			System.out.println("OnFinish");
		}
	  
	  @Override
		public void onTestSuccess(ITestResult result) {
			// TODO Auto-generated method stub
			ITestListener.super.onTestSuccess(result);
			Reporter.log("Success");
			System.out.println("Success");
		}
	  
	  @Override
		public void onTestFailure(ITestResult result) {
			// TODO Auto-generated method stub
			ITestListener.super.onTestFailure(result);
			Reporter.log("Fail"+result);
			System.out.println("Failed");
		}
	  
	  @Override
		public void onTestSkipped(ITestResult result) {
			// TODO Auto-generated method stub
			ITestListener.super.onTestSkipped(result);
			Reporter.log("Skipped"+result);
		}
	  
	  @Override
		public void onTestStart(ITestResult result) {
			// TODO Auto-generated method stub
			ITestListener.super.onTestStart(result);
			Reporter.log("Method is started");
		}
}
