package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnWindowHandle
{
	public static void main(String[] args) 
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://demowebshop.tricentis.com/");
		String windowId = c1.getWindowHandle();
		System.out.println(windowId);
		
	}

}
