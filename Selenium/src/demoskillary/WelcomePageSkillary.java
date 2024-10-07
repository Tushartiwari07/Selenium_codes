package demoskillary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePageSkillary 
{
	public WelcomePageSkillary(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	@FindBy(linkText = "LOGIN")
	private WebElement loginLink;
	
	@FindBy(id = "navbar-search-input")
	private WebElement searchTextFeild;
	
	/**
	 * @return the searchTextFeild
	 */
	public WebElement getSearchTextFeild() {
		return searchTextFeild;
	}
	@FindBy(id = "email")
	private WebElement emailTextField;
	
	@FindBy(id = "password")
	private WebElement passwordTextField;
	
	@FindBy(id = "last")
	private WebElement loginButton;

}
