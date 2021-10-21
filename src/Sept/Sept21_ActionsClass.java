package Sept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sept21_ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		WebElement ele;
		//driver.get("https://www.google.com");
		//ele=  driver.findElement(By.xpath("//*[@name=\"q\"]"));
		/*
		// We can send data in capital by pressing shift key
		//sequence is Keep SHift Key pressed  => type data  => release Shift key
		act.keyDown(ele,Keys.SHIFT).sendKeys("hello").keyUp(Keys.SHIFT).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ESCAPE).build().perform();
		driver.findElement(By.xpath("//*[@name='q']//following::input[3]")).click();		
		Thread.sleep(2000);
		*/
		
		//facebook form using Actions class
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		try {
		driver.findElement(By.xpath("//a[text()=\"English (UK)\"]")).click();  //click eng lang
		}catch (Exception e) {
			System.out.println("Already in English format");
		}
		driver.findElement(By.xpath("//*[@type=\"password\"]//following::a[3]")).click();
		ele=driver.findElement(By.xpath("//*[@name=\"firstname\"]"));
		act.keyDown(ele,Keys.SHIFT).sendKeys("ravindra").keyUp(Keys.SHIFT).build().perform();
		act.keyDown(ele,Keys.CONTROL).sendKeys("A").sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		
		//act.keyDown(Keys.SHIFT).sendKeys("bhosale").keyUp(Keys.SHIFT).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		
		act.keyDown(Keys.SHIFT).sendKeys("bhosale@yahoo.com").keyUp(Keys.SHIFT).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		
		act.keyDown(Keys.SHIFT).sendKeys("bhosale@!$Password").keyUp(Keys.SHIFT).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		
		act.sendKeys("15").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		
		act.sendKeys("Jul").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		
		act.sendKeys("1989").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.SPACE).build().perform();		
		
		
		Thread.sleep(3000);
		//driver.close();

	}

}
