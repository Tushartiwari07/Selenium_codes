package listeners;
import org.testng.Assert;
import org.testng.Reporter;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import demowebshop.BaseClassForDemoWebShop;

public class BooksPageCheck extends BaseClassForDemoWebShop
{
	@Test
	public void booksPage()
	{
		wlcm.getBooksLink();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Books","Books page not displayed");
		Reporter.log("Books page displayed",true);
		
		
	}



}
