package script;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import demoskillary.WelcomePageSkillary;

public class POM_DDT_DemoSkillary
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./TestData/ExcelTestData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String url = workbook.getSheet("Login").getRow(3).getCell(0).getStringCellValue();
		String email = workbook.getSheet("Login").getRow(3).getCell(1).getStringCellValue();
		String password = workbook.getSheet("Login").getRow(3).getCell(2).getStringCellValue();
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		WelcomePageSkillary ds=new WelcomePageSkillary(driver);
		ds.getLoginLink().click();
		ds.getEmailTextField().sendKeys(email);
		ds.getPasswordTextField().sendKeys(password);
		ds.getLoginButton().click();
		
		
	}
	
	
}
