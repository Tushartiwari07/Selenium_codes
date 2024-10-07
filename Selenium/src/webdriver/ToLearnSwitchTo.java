package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
//		c1.get("https://demowebshop.tricentis.com/");
//		c1.findElement(By.linkText("Facebook")).click();
		c1.get("https://www.shoppersstack.com/products_page/81");
		Thread.sleep(20000);                    
		c1.findElement(By.id("compare")).click();
		Set<String> WIDs = c1.getWindowHandles();
		for(String id: WIDs)
		{
			System.out.println(id);
			String url = c1.switchTo().window(id).getCurrentUrl();
//			if(url.contains("amazon"))
//			{
//				c1.close()
//			}
			if(url.contains("ebay"))
			{
				c1.manage().window().maximize();
			}
			Thread.sleep(1000);		
			
		 }
	}

}
