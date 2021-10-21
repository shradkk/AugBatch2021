package Sept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sept08_locator_id {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("bhosalerb2007@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("132654");
		driver.findElement(By.id("u_0_d_ba")).click();

	}

}
