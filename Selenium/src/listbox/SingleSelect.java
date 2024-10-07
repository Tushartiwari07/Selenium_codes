package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/signup");
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select daySelect = new Select(dayDropDown);
		daySelect.selectByIndex(14);
		WebElement monDropDown = driver.findElement(By.id("month"));
		Select monSelect = new Select(monDropDown);
		monSelect.selectByValue("8");
		WebElement yearDropDown = driver.findElement(By.id("year"));
	     Select yearSelect = new Select(yearDropDown);
	     yearSelect.selectByVisibleText("1947");
	     
	}
}
