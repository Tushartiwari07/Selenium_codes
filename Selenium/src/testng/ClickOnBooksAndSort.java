package testng;

import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import demowebshop.BaseClassForDemoWebShop;
import demowebshop.DemoWebShopBooksPagePOM;
import demowebshop.DemoWelcomePagePOM;

public class ClickOnBooksAndSort extends BaseClassForDemoWebShop
{
	@Test
	public void booksSort()
	{
		DemoWelcomePagePOM wlcm=new DemoWelcomePagePOM(driver);
		wlcm.getBooksLink().click();
		DemoWebShopBooksPagePOM books=new DemoWebShopBooksPagePOM(driver);
		Reporter.log("Books page is displayed",true);
		Select sortSelect =new Select(books.getSortByDropDown());
		sortSelect.selectByVisibleText("Name: Z to A");
		
		Select displaySelect =new Select(books.getDisplayDropDown());
		displaySelect.selectByVisibleText("8");
		
		Select viewSelect = new Select(books.getViewDropDown());
		viewSelect.selectByVisibleText("List");
		
		
	}

}
