package MethodsToUse;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class SwitchToMethod 
{
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
