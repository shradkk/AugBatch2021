package Sept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sept08_Basic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "F:\\chromedriver\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		// get is used to open website url
		driver.get("https:\\www.gmail.com");
		
		//to get page title
		String title=driver.getTitle();
		System.out.println("Page title is "+title);
		
		//to get page url
		String myurl=driver.getCurrentUrl();
		System.out.println("Page current url is "+myurl);
		
		// to get source code of webpage
		String scode=driver.getPageSource();
		//System.out.println("Source code is "+scode);
		
		
		//to maximise the window use following
		driver.manage().window().maximize();
		
		//Navigation
		// second way to open a webpage is navigate().to()
		driver.navigate().to("https:\\www.yahoo.com");
		Thread.sleep(1000);
		
		// go to the last visited page
		driver.navigate().back();
		
		//to next page
		driver.navigate().forward();
		
		// to refresh/ reload the page
		driver.navigate().refresh();
		
		// to close current webpage where driver has control
		driver.close();
		//driver.quit();  // to close one or more webpage opened by driver	
		
		
	}

}
