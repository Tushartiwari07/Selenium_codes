package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWorkShopDropDownAssign
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/books");
		WebElement sortDropDown = driver.findElement(By.id("products-orderby"));
		Select sortSelect = new Select(sortDropDown);
		sortSelect.selectByIndex(2);
		WebElement display = driver.findElement(By.id("products-pagesize"));
		Select disSelect = new Select(display);
		disSelect.selectByVisibleText("12");
		WebElement view = driver.findElement(By.id("products-viewmode"));
		Select viewSelect = new Select(view);
		viewSelect.selectByVisibleText("List");
		viewSelect.deselectByVisibleText("list");	
		
	}

}
