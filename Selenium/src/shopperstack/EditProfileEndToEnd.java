package shopperstack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EditProfileEndToEnd extends BaseClassShopperStack {
	@Test
	public void editProfile() throws InterruptedException {
		MyProfilePageShopperStack edpro = new MyProfilePageShopperStack(driver);
		String firstName = workbook.getSheet("Login").getRow(4).getCell(4).getStringCellValue();
		String lastName = workbook.getSheet("Login").getRow(4).getCell(5).getStringCellValue();
		String dateOfBirth = workbook.getSheet("Login").getRow(4).getCell(8).getStringCellValue();
		String phoneNumber = workbook.getSheet("Login").getRow(4).getCell(13).getStringCellValue();
		wlcm = new WelcomePageShopperStack(driver);
		wlcm.getSettingButton().click();
		wlcm.getMyProfileButton().click();
		Thread.sleep(2000);

		edpro.getEditProfileButton().click();
		Thread.sleep(2000);
		edpro.getFirstNameTextField().clear();
		edpro.getFirstNameTextField().sendKeys(firstName);
		edpro.getLastNameTextField().clear();
		edpro.getLastNameTextField().sendKeys(lastName);
		Thread.sleep(2000);
//		edpro.getDateOfBirthPopUp().clear();
//		Thread.sleep(2000);
//		edpro.getDateOfBirthPopUp().sendKeys(dateOfBirth);
		edpro.getPhoneNumberTestField().sendKeys(phoneNumber);
		Select countrySelect = new Select(edpro.getCountryDropDown());
		countrySelect.selectByValue("India");
		Select stateSelect = new Select(edpro.getStateDropDown());
		stateSelect.selectByValue("Karnataka");
		Select citySelect = new Select(edpro.getCityDropDown());
		citySelect.selectByValue("Bengaluru");
//		Thread.sleep(2000);
		edpro.getSubmitButton().click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		driver.navigate().back();
//		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//div[text()='January 2002']/../../../..//button[text()='16']"));

	}

}
