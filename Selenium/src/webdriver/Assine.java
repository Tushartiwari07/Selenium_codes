package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assine
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://demowebshop.tricentis.com/");
		String parentID = c1.getWindowHandle();
		c1.findElement(By.linkText("Facebook")).click();
		Set<String> ids = c1.getWindowHandles();
		for(String id: ids)
		{
			String url = c1.switchTo().window(id).getCurrentUrl();
			if(url.contains("facebook"))
			{
				break;
		    }
		}
		Thread.sleep(1000);
		c1.close();
		c1.switchTo().window(parentID);
		String title = c1.getTitle();	
		System.out.println(title);
	}

}
