package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/0");
		driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("books");
		driver.findElement(By.cssSelector("input[value='Search']")).click();	
	}
}
