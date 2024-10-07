package demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopBooksPagePOM 
{
	public DemoWebShopBooksPagePOM(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(id = "products-orderby")
	private WebElement sortByDropDown;
	
	@FindBy(id = "products-pagesize")
	private WebElement displayDropDown;
	
	@FindBy(id = "products-viewmode")
	private WebElement viewDropDown;

	public WebElement getSortByDropDown() {
		return sortByDropDown;
	}

	public WebElement getDisplayDropDown() {
		return displayDropDown;
	}

	public WebElement getViewDropDown() {
		return viewDropDown;
	}
	
	

}
