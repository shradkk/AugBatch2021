package Sept;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sept16_RadioButton {

	public static void main(String[] args) throws Exception {
		FileInputStream fin=new FileInputStream("F:\\Test\\AugBatchSelenium\\AugBatch.properties");
		// if project location get changed then there will be problem
		Properties p=new Properties();
		p.load(fin);
		System.setProperty("webdriver.chrome.driver",p.getProperty("chromedriver"));
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get(p.getProperty("fburl"));
		driver.findElement(By.xpath("//*[@data-testid=\"open-registration-form-button\"]")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//*[@name=\"sex\" and @value='2']"));
		if(ele.isDisplayed())
			System.out.println("This radio button is displayed ");
		if(ele.isEnabled())
			System.out.println("This radio button is enabled ");
		if(!ele.isSelected())
			System.out.println("This is not selected ");
		ele.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name=\"sex\" and @value='1']")).click();
		
		Select days=new Select(driver.findElement(By.xpath("//select[@id=\"day\"]")));
		days.selectByValue("10");
		//days.selectByVisibleText("10");
		
		Select mon=new Select(driver.findElement(By.xpath("//select[@id=\"month\"]")));
		//mon.selectByVisibleText("Dec");
		mon.selectByValue("12");
		
		Select year=new Select(driver.findElement(By.xpath("//select[@id=\"year\"]")));
		year.selectByVisibleText("1986");
		//year.selectByValue("1986");
		
	}

}
