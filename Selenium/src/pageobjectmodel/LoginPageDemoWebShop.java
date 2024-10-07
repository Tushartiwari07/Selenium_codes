package pageobjectmodel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageDemoWebShop
{
	public LoginPageDemoWebShop(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	
	@FindBy(id = "RememberMe")
	private WebElement rememberMeCheckBox;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;


	public WebElement getEmailTextField() {
		return emailTextField;
	}

	
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	
	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
}
