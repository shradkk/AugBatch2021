package MyTestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


public class Oct10_CrossBrowser {
	WebDriver  driver=null;
  @Test
  public void f() {	  
	  driver.get("https://www.google.com");
	  driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("Selenium");
	  driver.findElement(By.xpath("//*[@name=\"q\"]")).submit();
  }
  
  @BeforeClass
  @Parameters({"MyBrowser"})
  private void BeforeClass1(String b) {
	  if(b.equals("Mozila")) {
		  System.setProperty("webdriver.gecko.driver", "F:\\chromedriver\\geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	  if(b.equals("Chrome")) {
		  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		  driver=new ChromeDriver();
	  }

}
  
  @DataProvider(name = "Browser")
  public Object[][] mybrow() {
	return new Object[][] {
		{"Chrome"},{"Mozila"}		
	};

}
}
