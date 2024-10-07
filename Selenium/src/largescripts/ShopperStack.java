package largescripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import shopperstack.AddressPageShopperstack;
import shopperstack.LoginPageShopperStack;
import shopperstack.WelcomePageShopperStack;

public class ShopperStack
{
	@Test
	public void login() throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream fis = new FileInputStream("./TestData/ExcelTestData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		//-----------------------------------------Login--------------------------------

		String email = workbook.getSheet("Login").getRow(4).getCell(3).getStringCellValue();
		String password = workbook.getSheet("Login").getRow(4).getCell(2).getStringCellValue();
		String name = workbook.getSheet("Login").getRow(4).getCell(4).getStringCellValue();
		String house = workbook.getSheet("Login").getRow(4).getCell(9).getStringCellValue();
		String street = workbook.getSheet("Login").getRow(4).getCell(10).getStringCellValue();
		String landmark = workbook.getSheet("Login").getRow(4).getCell(11).getStringCellValue();
//	    int pincode=(int) workbook.getSheet("Login").getRow(4).getCell(12).getNumericCellValue();
//	    long phonenumber = (long)workbook.getSheet("Login").getRow(4).getCell(13).getNumericCellValue();
	     String pincode = workbook.getSheet("Login").getRow(4).getCell(12).getStringCellValue();
	     String phonenumber = workbook.getSheet("Login").getRow(4).getCell(13).getStringCellValue();
//	    System.out.println(pincode);
//	    System.out.println(phonenumber);

		
//-----------------------------------------Address--------------------------------
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.shoppersstack.com/user-signin");
		LoginPageShopperStack lp = new LoginPageShopperStack(driver);
		lp.getEmailTextField().sendKeys(email);
		lp.getPasswordTextField().sendKeys(password);
		lp.getLoginButton().click();
//		//--------------WelcomePage---------------
		WelcomePageShopperStack wlsp = new WelcomePageShopperStack(driver);
		wlsp.getSettingButton().click();
		wlsp.getMyProfileButton().click();
		wlsp.getMyAddressButton().click();
		wlsp.getAddAddressButton().click();
//		//-----------------AddAddressPage----------------
		AddressPageShopperstack adsp=new AddressPageShopperstack(driver);
		adsp.getHomeRadioButton().click();
		adsp.getNameTextField().sendKeys(name);
		adsp.getHouseTextField().sendKeys(house);
		adsp.getStreetTextField().sendKeys(street);
		adsp.getLandmarkTextFiled().sendKeys(landmark);
		Select countrySelect = new Select(adsp.getCountryDropDown());
		countrySelect.selectByValue("India");
		Select stateSelect = new Select(adsp.getStateDropDown());
		stateSelect.selectByValue("Karnataka");
		Select citySelect =new Select(adsp.getCityDropDown());
		citySelect.selectByValue("Bengaluru");
		adsp.getPinCodeTextField().sendKeys(pincode);
		adsp.getPhoneNumberTextField().sendKeys(phonenumber);
		Thread.sleep(3000);
		wlsp.getAddAddressButton().click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		driver.navigate().back();
		driver.navigate().back();
		wlsp.getSettingButton().click();
		wlsp.getMyProfileButton().click();
		wlsp.getLogoutButton().click();
			
	}

}
