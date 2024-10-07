package listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectedOption
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement priceList = driver.findElement(By.id("cars"));
		Select priceBox = new Select(priceList);
		priceBox.selectByIndex(2);
		priceBox.selectByIndex(3);
		priceBox.selectByIndex(0);
		
//		WebElement firstselect = priceBox.getFirstSelectedOption();
//		System.out.println(firstselect.getText());
		List<WebElement> allSelect = priceBox.getAllSelectedOptions();
		System.out.println("Total selected "+allSelect.size());
		for(WebElement option:allSelect)
		{
			System.out.println(option.getText());
		}	
	}

}
