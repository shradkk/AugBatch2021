package Sept;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sept19_ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		WebDriverWait w1=new WebDriverWait(driver, 40);
		WebElement webel=w1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[contains(@title,\"Helpline Number for CoronaVirus +91-11-23978046 or 1075\")])[2]")));
		//webel.click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(30, TimeUnit.SECONDS) 			
				.pollingEvery(5, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);
		//WebElement ele=(WebElement) wait.until(ExpectedConditions.alertIsPresent())
		
	
				
	}

}
