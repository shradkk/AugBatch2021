package Sept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sept22_MouseActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		WebElement ele;
		driver.get("https://facebook.com");
		
		try {
		driver.findElement(By.xpath("//a[text()=\"English (UK)\"]")).click();  //click eng lang
		}catch (Exception e) {
			System.out.println("Already in English format");
		}
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//a[text()=\"About\"]"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@type=\"password\"]//following::a[3]")).click();
		act.click(driver.findElement(By.xpath("//*[@aria-label=\"New password\"]"))).sendKeys("586846").build().perform();
		act.click(driver.findElement(By.xpath("//label[text()=\"Male\"]"))).build().perform();
		act.click(driver.findElement(By.xpath("(//*[text()=\"Terms\"])[2]"))).perform();

	}

}
