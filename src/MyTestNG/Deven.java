package MyTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Deven {
	public WebDriver driver=null;

	@BeforeMethod
	public void setup() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.manage().deleteAllCookies();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	Thread.sleep(4000);
	//driver.findElement(By.xpath("//*[text()='English (UK)']")).click();
	//driver.findElement(By.xpath("//*[text()='English (UK)']")).click();
	}

	@DataProvider(name="getdata")
	public Object[][] gettestdata()
	{
	return new Object[][] {{"user1","pass1"},{"user2","pass2"}};
	}

	@Test(dataProvider="getdata")
	public void testing(String username,String Passwrd) throws InterruptedException
	{

	//driver.findElement(By.xpath("//*[@id=\"login1\"]")).clear();
		System.out.println("Here");
	driver.findElement(By.xpath("//*[@id=\"login1\"]")).sendKeys(username);
	//driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Passwrd);
	driver.findElement(By.xpath("//*[@value=\"Sign in\"]")).submit();
	//Thread.sleep(20000);
	}

}
