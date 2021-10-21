package Sept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sept09_Locator_NAME {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "f:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();// full screening chrome
	/*	driver.get("https:\\www.facebook.com");
		
		//username
		driver.findElement(By.name("email")).sendKeys("bhosalerb2007@gmail.com");
		//password
		driver.findElement(By.name("pass")).sendKeys("12345");
		//log in button
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
	*/	
		//yahoo
		driver.get("https:\\www.yahoo.com");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("username")).sendKeys("bhosalerb2007@yahoo.com");
		driver.findElement(By.name("signin")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("verifyPassword")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
