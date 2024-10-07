package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePageDemoWebShop
{
	//initialization
	public WelcomePageDemoWebShop(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//----------------------Register Link--------------------
	//delceration
	@FindBy(linkText = "Register")
	private WebElement registerLink;

	public WebElement getRegisterLink()
	{
		return registerLink;
	}
	
	//----------------------Register Link--------------------
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	public WebElement getLoginLink()
	{
		return loginLink;
	}
	
	//-------------------------ShoppingCart Link------------------
	@FindBy(linkText = "Shopping cart")
	private WebElement shoppinhCartLink;
	
	public WebElement getShoppinhCartLink() 
	{
		return shoppinhCartLink;
	}
	
	//-----------------------------
	@FindBy(linkText = "Wishlist")
	private WebElement wishlistLink;

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	
	
	

}
