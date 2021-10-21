package Sept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sept09_Locator_ClassName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\facebook.com");
		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("bhosalerb20340");
		driver.findElement(By.className("inputtext _55r1 _6luy _9npi")).sendKeys("123345");
		driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();

	}

}
