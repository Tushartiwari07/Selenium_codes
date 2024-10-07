package datadriventesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ReadDataFromExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		//step 1: create a fileinputstream object
		FileInputStream fis=new FileInputStream("./TestData/ExcelTestData.xlsx");
		
		//step 2: create respective object
		Workbook workbook = WorkbookFactory.create(fis);
		
		//step 3: call readMethods	
		String url = workbook.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		String username = workbook.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		String password = workbook.getSheet("Login").getRow(1).getCell(2).getStringCellValue();
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   
		   driver.get(url);
		   driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
		   File temp = driver.findElement(By.xpath("//div[contains(text(),'Sorry, your password was incorrect.')]")).getScreenshotAs(OutputType.FILE);
		   File dest=new File("./ScreenShots/errInsta.png");
		   FileHandler.copy(temp, dest);
		   Thread.sleep(2000);
		   driver.close();
		   
	}

}
