package MyTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Sept27_DependsOnGroup {
	WebDriver driver=null;
	Actions act=null;
	
	
  @Test(groups= {"basic"},dependsOnMethods = "init12")
  public void openURL() {
	  driver.get("https://www.google.com");	  
  }
  
  
  @Test(dependsOnGroups = {"basic"})
  public void find() {
	driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("Selenium");
	act.sendKeys(Keys.TAB).build().perform();
	driver.findElement(By.xpath("//*[@name=\"q\"]//following::input[3]")).click();
}
  @Test(groups= {"gmail"},dependsOnGroups = {"basic"})
  public void clickgmail() {
	  driver.findElement(By.xpath("//a[contains(text(),\"Gmail\")]")).click();
  }
  
  @Test(groups= {"gsearch"},dependsOnMethods = {"find"})
  public void displayResult() {
	  System.out.println(driver.findElement(By.xpath("//*[@id=\"result-stats\"]")));
  }
  
  @Test(groups= {"basic"})
  public void init12() {
	  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  act=new Actions(driver);
  }

  @AfterSuite(alwaysRun = true)
  public void aftersuite() {
	  driver.close();
  }

}
