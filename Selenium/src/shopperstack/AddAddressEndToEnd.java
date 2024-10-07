package shopperstack;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AddAddressEndToEnd extends BaseClassShopperStack
{
	@Test
	public void addAddress() throws InterruptedException
	{
		WelcomePageShopperStack wlsp=new WelcomePageShopperStack(driver);
		String name = workbook.getSheet("Login").getRow(4).getCell(4).getStringCellValue();
		String house = workbook.getSheet("Login").getRow(4).getCell(9).getStringCellValue();
		String street = workbook.getSheet("Login").getRow(4).getCell(10).getStringCellValue();
		String landmark = workbook.getSheet("Login").getRow(4).getCell(11).getStringCellValue();
	     String pincode = workbook.getSheet("Login").getRow(4).getCell(12).getStringCellValue();
	     String phonenumber = workbook.getSheet("Login").getRow(4).getCell(13).getStringCellValue();
	     
	 	wlsp.getSettingButton().click();
		wlsp.getMyProfileButton().click();
		wlsp.getMyAddressButton().click();
		wlsp.getAddAddressButton().click();
		
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
		
	}

}
