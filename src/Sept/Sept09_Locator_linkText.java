package Sept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sept09_Locator_linkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\google.com");
		driver.findElement(By.linkText("हिन्दी")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("मराठी")).click();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("English")).click();
		driver.findElement(By.partialLinkText("Engl")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(2000);

	}

}
