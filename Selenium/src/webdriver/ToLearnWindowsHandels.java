package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.org.antlr.v4.runtime.atn.WildcardTransition;

public class ToLearnWindowsHandels 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://demowebshop.tricentis.com/");
		Thread.sleep(10000);
		c1.findElement(By.linkText("Facebook")).click();
		Set<String> WIDs = c1.getWindowHandles();
		System.out.println(WIDs);
		for(String id : WIDs)
		{
			System.out.println(id);
		}
			
		
	}

}
