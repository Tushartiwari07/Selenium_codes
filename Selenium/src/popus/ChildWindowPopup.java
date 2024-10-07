package popus;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup
{
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/products_page/18");
		String parentId = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.id("compare")).click();
		Set<String> childIds = driver.getWindowHandles();
		for(String handle:childIds)
		{
			String url = driver.switchTo().window(handle).getCurrentUrl();
			if(url.contains("amazon"))
			{
			  driver.close();
			}	
			else if(url.contains("https://www.ebay.com/"))
			{
				driver.close();
			}
			else if(url.contains("flipkart"))
			{
				break;
			}
		}
		  driver.manage().window().maximize();
		  System.out.println(driver.getCurrentUrl());
		  Thread.sleep(3000);
		  driver.close();
		  driver.switchTo().window(parentId);
		  driver.findElement(By.id("Add To Cart")).click();
		  
		  
		  
	}

}
