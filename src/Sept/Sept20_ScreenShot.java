package Sept;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sept20_ScreenShot {

	public static void main(String[] args) {
		String path="F:\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=null;
		try {
			
			driver=new ChromeDriver();
			TakesScreenshot scr=(TakesScreenshot) driver;
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://www.google.com");
			driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("Selenium");
			Thread.sleep(2000);
			File f1=scr.getScreenshotAs(OutputType.FILE);
			Date dt=new Date();
			String name="F:\\chromedriver\\"+dt.getDate()+dt.getMonth()+dt.getYear()+dt.getHours()+dt.getMinutes()+dt.getSeconds();
			FileUtils.copyFile(f1, new File(name));
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		driver.close();

	}

}
