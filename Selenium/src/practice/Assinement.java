package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assinement {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.shoppersstack.com/products_page/17");
	    String ParentId = c1.getWindowHandle();
		Thread.sleep(20000);
		c1.findElement(By.id("compare")).click();
		Set<String> AllWids = c1.getWindowHandles();
		for(String id:AllWids)
		{
			System.out.println(id);
			String url = c1.switchTo().window(id).getCurrentUrl();
			if(!url.contains("shoppersstack"))
			{
				c1.close();
			}
			Thread.sleep(1000);
          }
		c1.switchTo().window(ParentId);
		String title = c1.getTitle();
		System.out.println(title);
	}	

}

