package MyTestNG;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sept28_Parameterd {
  @Test(invocationCount = 3)
  @Parameters({"val1","val2"})
  public void f(String val1,String val2) {
	  System.out.println(val1+" + "+val2+" = "+(val1+val2));
  }
  
  @Test(enabled = false)
  @Parameters({"driver","path","url"})
  public void f2(String val1,String val2,String url) {
	  System.setProperty(val1, val2);
	  WebDriver driver=new ChromeDriver();
	  driver.get(url);
	  
  }
}
