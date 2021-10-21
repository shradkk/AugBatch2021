package Sept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sept13_Xpath_gsearch01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\google.com");
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("Income tax");
		//driver.findElement(By.xpath("//*[@type=\"text\"]//following::input[3]")).click();
		driver.findElement(By.xpath("//*[@name=\"q\"]")).submit();
		Thread.sleep(3000);
		String str=driver.findElement(By.xpath("//*[@id=\"result-stats\"]")).getText();
		System.out.println("Search results is: "+str);
		
		
		
		driver.navigate().to("https:\\facebook.com");
		driver.findElement(By.xpath("//*[@name=\"pass\"]//preceding::input[@name=\"email\"]")).sendKeys("bhosalerb2007");
		driver.findElement(By.xpath("//*[@name=\"pass\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@name=\"pass\"]//following::button")).click();
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
