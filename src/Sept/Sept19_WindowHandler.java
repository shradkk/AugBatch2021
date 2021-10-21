package Sept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sept19_WindowHandler {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naukri.com");
		String MainWindow=driver.getWindowHandle(); // main window
		Set<String> winhand= driver.getWindowHandles();
		for (String str : winhand) {
			if(!str.equals(MainWindow)) {
				driver.switchTo().window(str);
				System.out.println(" Title= "+driver.getTitle());
				if(driver.getTitle().equals("Ellie MAE")) {
					driver.findElement(By.xpath("//*[@src=\"https://company.naukri.com/popups/ellie-mae/14sep2021/ice-mortgage-ak-14sep2021.gif\"]")).click();
				Thread.sleep(3000);
				
				}
				driver.close();
			}
		}
		driver.switchTo().window(MainWindow);
		System.out.println(" Title= "+driver.getTitle());
		driver.quit();
	}

}
