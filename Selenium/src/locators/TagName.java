package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//--------------IMPORTANT QUESTION----------
		//Check how many links are present in the web page
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		  System.out.println(allLinks.size());
		  
			List<WebElement> allImages = driver.findElements(By.tagName("img"));
			System.out.println(allImages.size());

	

	}

}
