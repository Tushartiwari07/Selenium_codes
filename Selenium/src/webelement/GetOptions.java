package webelement;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions
{
	public static void main(String[] args)
   {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
//	driver.get("https://demoapp.skillrary.com/");
//	WebElement priceList = driver.findElement(By.id("cars"));
//	 Select priceSelect= new Select(priceList);

	driver.get("https://www.facebook.com/signup");
	WebElement fbYear =driver.findElement(By.id("year"));
	
	 Select priceSelect= new Select(fbYear);	
	List<WebElement> allOptions = priceSelect.getOptions();
	int lastoption = priceSelect.getOptions().size()-1;
	priceSelect.selectByIndex(lastoption);
//	priceSelect.getOptions().getLast().click();
	System.out.println("Total months "+ allOptions.size());
//	for(WebElement option:allOptions)
//	{
//		System.out.println(option.getText());
//	}
//	System.out.println(priceSelect.isMultiple());
	}

}
