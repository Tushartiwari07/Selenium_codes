package program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReverseString {
	
	public static void main(String[] args) {
		String str="Tushar";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch= str.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
	}
	
	public void test() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss,new File("./scr/screenshots"));
		
		
		//tagname[@AN='AV']
		//tagnme[text()='text']
		//tagname[contains(@AN,'AV']
		//tagname[contains(text(),'textvalue']
		//tagnamee[@AN='AV']/parent::tagname
		//tagnamee[@AN='AV']/child::tagname
		//tagnamee[@AN='AV']/descedent::tagname
		//tagname[@AN='AV' and @AN='AV]
		//tagname[@AN='AV' or @AN='AV]
		//svg[name()='svg']
		//tagname[@AN='AV']/../..
//		(//tagname[@AN='AV'])[1]
		
		FileInputStream fis= new FileInputStream("./scr/testData.xlx");
		Workbook workbook = WorkbookFactory.create(fis);
		String stringdata = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		double num = workbook.getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		boolean trueFalse =workbook.getSheet("Sheet1").getRow(1).getCell(1).getBooleanCellValue();
		workbook.getSheet("Sheet1").getRow(1).getCell(1).setCellValue("data");
	
		FileOutputStream fos = new FileOutputStream("./scr/testData.xlx");
		workbook.write(fos);
		workbook.close();
		
		String singleWindow = driver.getWindowHandle();
		Set<String> multipleWindow= driver.getWindowHandles();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click", singleWindow);
		
		Actions act = new Actions(driver);
//		act.
		
		
	
		
	
	
	}

}
