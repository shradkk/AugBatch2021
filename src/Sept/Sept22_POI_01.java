package Sept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sept22_POI_01 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriverSept22.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		FileInputStream fio=new FileInputStream("I:\\Sample.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fio);
		XSSFSheet mysheet=wb.getSheet("Assign01");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Alert alt;
		//to find row NO
		int totalRow=mysheet.getLastRowNum()-mysheet.getFirstRowNum();
		for(int i=0;i<=totalRow;i++) {
			XSSFRow r=mysheet.getRow(i);
			String val=r.getCell(0).getStringCellValue();			
			System.out.println(val);			
			driver.findElement(By.xpath("//*[@name=\'q\']")).clear();
			driver.findElement(By.xpath("//*[@name=\'q\']")).sendKeys(val);
			driver.findElement(By.xpath("//*[@name=\'q\']")).submit();
			Thread.sleep(1000);
			String result=driver.findElement(By.xpath("//*[@id=\"result-stats\"]")).getText();
			System.out.println(result);
			r.createCell(1).setCellValue(result);
			js.executeScript("alert('Searched');");
			Thread.sleep(2000);
			alt=driver.switchTo().alert();
			alt.accept();

		}
		//till now out xlsx file is in read mode we can not write data into it
		//hence close it & open it for writting purpose
		fio.close();
		FileOutputStream fos=new FileOutputStream("I:\\Sample.xlsx");
		wb.write(fos);
		fos.close();
		wb.close();
	}

}
