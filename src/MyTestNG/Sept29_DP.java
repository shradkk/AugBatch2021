package MyTestNG;

import java.util.Calendar;
import java.util.Date;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(MyTestNG.Sept30_Listeners.class)
public class Sept29_DP {

  @Test(dataProvider ="LocalDP", invocationCount = 2)
  public void f(String a,String b) {
	  //onTestStart()
	  System.out.println(Calendar.getInstance().getTimeInMillis());
	  SoftAssert soft=new SoftAssert(); // if fail OnFailue
	  System.out.println("Host= "+a+" URL="+b); //if not failed OnSuccess
  }
  
  @Test(dataProvider = "firstDP", dataProviderClass = MyTestNG.NewTest.class)
  public void g(int a,int b,int c) {
	  System.out.println(Calendar.getInstance().getTimeInMillis());
	  System.out.println(a+" "+b+" "+c);
	  Assert.assertEquals((a+b), c);
	  Reporter.log("Successful");
	  
  }
  
  @DataProvider(name="LocalDP")
	public Object[][] myDP(){
		return new Object[][] {			
			{"Google","https://www.google.com"},
			{"Facebook","https://www.facebook.com"}
		};
	}
  
  
  
  
}
