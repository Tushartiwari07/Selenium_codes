package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import demowebshop.BaseClassForDemoWebShop;
import demowebshop.DemoWelcomePagePOM;

public class Demoooooooooo extends BaseClassForDemoWebShop
{
	@Test
	public void clickonBooks()
	{
		wlcm=new DemoWelcomePagePOM(driver);
		wlcm.getBooksLink().click();
		driver.findElement(By.xpath("//a[text()='Fiction']/../..//input[@value='Add to cart']")).click();
		wlcm.getCartLink().click();
//		WebElement countryId = driver.findElement(By.id("CountryId"));
//		Actions act = new Actions(driver);
//		act.scrollToElement(countryId).perform();
//		Select countrySelect = new Select(countryId);
//		countrySelect.selectByValue("India");
		driver.navigate().back();
		driver.navigate().back();
		wlcm.getGoodRadioButton().click();
		wlcm.getVoteButton().click();
		wlcm.getSearchButton().click();
		driver.switchTo().alert().accept();
		wlcm.getComputerLink().click();
		driver.findElement(By.partialLinkText("Notebook")).click();
		driver.navigate().back();
		driver.navigate().back();
		
		}

}