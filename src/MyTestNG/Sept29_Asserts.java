package MyTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sept29_Asserts {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  Assert.assertNotNull(driver, "Driver is Null");
	  driver.get("https://www.google.com");
	  SoftAssert soft=new SoftAssert();
	  soft.assertEquals("Google", driver.getTitle());
	  driver.findElement(By.xpath("//*[@name=\'q\']")).sendKeys("Selenium");
	  //driver.findElement(By.xpath("//*[@name=\'q\']")).submit();
	  Actions act=new Actions(driver);
	  act.sendKeys(Keys.TAB).perform();
	  driver.findElement(By.xpath("//*[@name='q']//following::input[3]")).click();
	  soft.assertEquals(driver.getTitle(),"Selenium");
	  soft.assertAll();
	  
	  
	soft.assertEquals(driver.getTitle(), "Log in to facebook");
		 
  }
}
