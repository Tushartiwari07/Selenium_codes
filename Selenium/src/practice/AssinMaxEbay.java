package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssinMaxEbay 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.shoppersstack.com/products_page/17");
		String parentId = c1.getWindowHandle();
		Thread.sleep(10000);
		c1.findElement(By.id("compare")).click();
		Set<String> AllWids = c1.getWindowHandles();
		for(String id:AllWids)
		{
			String url = c1.switchTo().window(id).getCurrentUrl();
			if(url.contains("ebay"))
			{
				c1.manage().window().maximize();
			}
		}
	
	    c1.switchTo().window(parentId);
	}

}
