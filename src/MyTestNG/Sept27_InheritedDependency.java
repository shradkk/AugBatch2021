package MyTestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sept27_InheritedDependency extends xyz {
	public static WebDriver driver=null;
	Actions act=null;
	
	
  @Test(groups= {"basic"},dependsOnMethods = "init12")
  public void openURL() {
	  driver.get("https://www.google.com");	
	  Reporter.log("My Google page is open now");
  }
  
  @Test(groups= {"basic"})
  public void init12() {
	  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  act=new Actions(driver);
	  Reporter.log("Driver get initialised here");
  }
	
}

class xyx {
	
	@Test(groups= {"gmail"},dependsOnGroups = {"basic"})
	  public void clickgmail() {
		  System.out.println("Statement executed after basic group of other class");
	  }
	
}