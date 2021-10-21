package Sept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sept15_useOfProperties {

	public static void main(String[] args) throws Exception {
		//String path=System.getProperty("user.dir")+"\\AugBatch.properties";
		//FileInputStream fin=new FileInputStream(path);  //if project location get change no need to worry
		
		FileInputStream fin=new FileInputStream("F:\\Test\\AugBatchSelenium\\AugBatch.properties");
		// if project location get changed then there will be problem
		Properties p=new Properties();
		p.load(fin);
		String myurl=p.getProperty("url");
		System.out.println(myurl);
		System.setProperty("webdriver.chrome.driver",p.getProperty("chromedriver"));
		WebDriver driver=new ChromeDriver();
		driver.get(p.getProperty("url"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(p.getProperty("gmail"))).click();
		Thread.sleep(3000);
		driver.findElement(By.name(p.getProperty("searchBox"))).sendKeys("Selenium");
		
		
	}

}
