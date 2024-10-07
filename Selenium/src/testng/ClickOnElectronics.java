package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClickOnElectronics extends BaseClass
{
	@Test
	public void clickOnElectronic()
	{
		driver.findElement(By.partialLinkText("Electronic")).click();
		Reporter.log("Electronic page displayed successfullly",true);
	
	}

}
