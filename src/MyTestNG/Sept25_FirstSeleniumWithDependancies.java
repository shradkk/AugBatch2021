package MyTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;

public class Sept25_FirstSeleniumWithDependancies {
	WebDriver driver=null;
	Actions act=null;
	
	
  @Test(groups= {"gsearch","gmail"},dependsOnMethods = "init12")
  public void openURL() {
	  driver.get("https://www.google.com");	  
  }
  
  
  @Test(dependsOnMethods = {"openURL","init12"},groups= {"gsearch"})
  public void find() {
	driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("Selenium");
	act.sendKeys(Keys.TAB).build().perform();
	driver.findElement(By.xpath("//*[@name=\"q\"]//following::input[3]")).click();
}
  @Test(groups= {"gmail"},dependsOnMethods = {"openURL"})
  public void clickgmail() {
	  driver.findElement(By.xpath("//a[contains(text(),\"Gmail\")]")).click();
  }
  
  @Test(dependsOnMethods = {"find"},groups= {"gsearch"})
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
