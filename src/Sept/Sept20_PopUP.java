package Sept;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sept20_PopUP {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in");	
		WebDriverWait wt=new WebDriverWait(driver, 20);
		try {
			wt.until(ExpectedConditions.alertIsPresent());     //Explicit Wait
			Alert alt1=driver.switchTo().alert();
			alt1.accept();
		}catch (Exception e) {
			System.out.println(e);
		}
				
		
		
		
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();

		Alert alt=driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();

		driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
		Thread.sleep(6000);
		alt=driver.switchTo().alert();
		alt.accept();

		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		Thread.sleep(2000);
		alt=driver.switchTo().alert();
		alt.dismiss();

		driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
		alt=driver.switchTo().alert();
		alt.sendKeys("Ravindra");// send data to text box
		alt.accept();
		Thread.sleep(2000);		
		driver.close();

	}

}
