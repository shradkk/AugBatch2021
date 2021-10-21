package Sept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sept11_Locator_CSS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\facebook.com");
		driver.findElement(By.cssSelector("*.inputtext._55r1._6luy")).sendKeys("bhosaletb");
		Thread.sleep(2000);		
		driver.findElement(By.cssSelector("*.inputtext._55r1._6luy")).sendKeys("123456");
	}

}
