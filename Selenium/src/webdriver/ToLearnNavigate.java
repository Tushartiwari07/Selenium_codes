package webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnNavigate 
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
//		c1.get("https://demowebshop.tricentis.com/");
//		c1.navigate().to("https://demowebshop.tricentis.com/");//It is use to navigate to the application without using get()
		c1.navigate().to(new URL("https://demowebshop.tricentis.com/"));//It is use to navigate to the application without using get()
		Thread.sleep(2000);
		c1.navigate().back();//It is used to perform Backword operations
		Thread.sleep(2000);
		c1.navigate().forward();//It is used to perform forward operations
		Thread.sleep(2000);
		c1.navigate().refresh();//It is used to Refresh//Reload the web page
		
		
		
	}

}
