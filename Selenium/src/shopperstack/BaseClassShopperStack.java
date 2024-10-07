package shopperstack;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClassShopperStack 
{
	WebDriver driver;
	FileInputStream fis;
	Workbook workbook;
	WelcomePageShopperStack wlcm;
	LoginPageShopperStack lp;

	
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
		fis = new FileInputStream("./TestData/ExcelTestData.xlsx");
		workbook=WorkbookFactory.create(fis);
		String url = workbook.getSheet("Login").getRow(4).getCell(0).getStringCellValue();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
	}
	
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException
	{
//		fis = new FileInputStream("./TestData/ExcelTestData.xlsx");
//		workbook=WorkbookFactory.create(fis);
		String email = workbook.getSheet("Login").getRow(4).getCell(3).getStringCellValue();
		String password = workbook.getSheet("Login").getRow(4).getCell(2).getStringCellValue();
		wlcm=new WelcomePageShopperStack(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(wlcm.getLoginButton()));
		wlcm.getLoginButton().click();
		 lp=new LoginPageShopperStack(driver);
		lp.getEmailTextField().sendKeys(email);
		lp.getPasswordTextField().sendKeys(password);
		lp.getLoginButton().click();
	}
	@AfterMethod
	public void logout()
	{
		wlcm.getSettingButton().click();
		wlcm.getLogoutButton().click();
		
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
