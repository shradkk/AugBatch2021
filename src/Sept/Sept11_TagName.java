package Sept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sept11_TagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\google.com");
		List<WebElement> mylinks=driver.findElements(By.tagName("a"));
		for (WebElement webEle : mylinks) {
			if(!webEle.getAttribute("href").equals(null))
				System.out.println(webEle.getText()+" Link="+webEle.getAttribute("href"));
		}
		driver.close();
	}

}
