package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		WebElement priceListBox = driver.findElement(By.id("cars"));
		Select priceSelect = new Select(priceListBox);
		priceSelect.selectByIndex(2);
		priceSelect.selectByValue("399");
		priceSelect.selectByVisibleText("More Than INR 500 ( 55 )");
//		priceSelect.deselectByIndex(2);
//		priceSelect.deselectByValue("399");
//		priceSelect.deselectByVisibleText("More Than INR 500 ( 55 )");
		priceSelect.deselectAll();
		
//		driver.findElement(By.xpath("//input[@type='Submit']")).click();	
		
	}
}
