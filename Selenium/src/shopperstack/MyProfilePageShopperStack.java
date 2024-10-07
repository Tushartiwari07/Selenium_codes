package shopperstack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePageShopperStack 
{
	public MyProfilePageShopperStack(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//button[contains(text(),'Edit Profile')]")
	private WebElement editProfileButton;
	
	@FindBy(id = "First Name")
	private WebElement firstNameTextField;
	
	@FindBy(id = "Last Name")
	private WebElement lastNameTextField;
	
	@FindBy(id = ":r9:-label")
	private WebElement dateOfBirthPopUp;
	
	@FindBy(id = "Phone Number")
	private WebElement phoneNumberTestField;
	
	@FindBy(id = "Country")
	private WebElement countryDropDown;
	
	@FindBy(id = "State")
	private WebElement stateDropDown;
	
	@FindBy(id = "City")
	private WebElement cityDropDown;
	
	@FindBy(id = "submit")
	private WebElement submitButton;

	public WebElement getEditProfileButton() {
		return editProfileButton;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getDateOfBirthPopUp() {
		return dateOfBirthPopUp;
	}

	public WebElement getPhoneNumberTestField() {
		return phoneNumberTestField;
	}

	public WebElement getCountryDropDown() {
		return countryDropDown;
	}

	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	public WebElement getCityDropDown() {
		return cityDropDown;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	
	
	
	
	

}
