package popus;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowMenthos 
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
		switchToWindow(driver, "amazon");
		System.out.println(driver.getCurrentUrl());
		driver.close();
		switchToWindow(driver, "flipkart");
		System.out.println(driver.getCurrentUrl());
		driver.close();
		switchToWindow(driver, "ebay");
		System.out.println(driver.getCurrentUrl());
		driver.close();
		switchToWindow(driver, "shopperstack");
		 driver.findElement(By.id("Add To Cart")).click();
	}
	public static void switchToWindow(WebDriver driver,String expUrl)
	{
		Set<String> childIds = driver.getWindowHandles();

		for(String id:childIds)
		{
			String url = driver.switchTo().window(id).getCurrentUrl();
			if(url.contains(expUrl))
			{
			  break;
			}	
	    }
	}

}
