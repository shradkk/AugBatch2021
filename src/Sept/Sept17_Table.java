package Sept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sept17_Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS); // used throughout this execution
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> li=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
		for (WebElement webEl : li) 
			System.out.print(webEl.getText()+"\t");
		int ncols=li.size();
		//li.clear();
		
		List<WebElement> lirows=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		int nrows=lirows.size();
		for(int i=2;i<=nrows;i++) {  // as 1st column is header & we had printed it already
			for(int j=1;j<=ncols;j++) {
				String st="//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]";
				System.out.print(driver.findElement(By.xpath(st)).getText()+"\t");
			}
			System.out.println();
		}
		driver.close();
	}

}
