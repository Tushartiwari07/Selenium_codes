package shopperstack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePageShopperStack {
	public WelcomePageShopperStack(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@aria-label='Account settings']")
	private WebElement settingButton;

	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logoutButton;

	@FindBy(xpath = "//li[text()='My Profile']")
	private WebElement myProfileButton;

	@FindBy(xpath = "//div[text()='My Addresses']")
	private WebElement myAddressButton;

	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addAddressButton;

	@FindBy(xpath = "(//span[contains(@class,'MuiButton-startIcon')])[2]")
	private WebElement deleteButton;

	@FindBy(id = "men")
	private WebElement mensLink;

	@FindBy(linkText = "T-shirts")
	private WebElement mensTshirtsLink;

	@FindBy(xpath = "//span[text()='JOMPERS']/../..//button[text()='add to cart']")
	private WebElement kurtaAddToCartButton;

	@FindBy(id = "cartIcon")
	private WebElement addToCartlink;

	@FindBy(xpath = "//button[text()='Remove from cart']")
	private WebElement removeFromCart;
	
	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement yesButtonRemoveFromCart;
	

	public WebElement getYesButtonRemoveFromCart() {
		return yesButtonRemoveFromCart;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getKurtaAddToCartButton() {
		return kurtaAddToCartButton;
	}

	public WebElement getRemoveFromCart() {
		return removeFromCart;
	}

	public WebElement getMyProfileButton() {
		return myProfileButton;
	}

	public WebElement getMyAddressButton() {
		return myAddressButton;
	}

	public WebElement getAddAddressButton() {
		return addAddressButton;
	}

	public WebElement getSettingButton() {
		return settingButton;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	@FindBy(id = "loginBtn")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getMensLink() {
		return mensLink;
	}

	public WebElement getMensTshirtsLink() {
		return mensTshirtsLink;
	}

	public WebElement getAddToCartlink() {
		return addToCartlink;
	}

}
