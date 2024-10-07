package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTabs 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.get("https://demowebshop.tricentis.com/");
		c1.findElement(By.linkText("Facebook")).click();
		Thread.sleep(5000);//It is used to wait for the specified time set by the programer
		c1.quit();//used to close all tabs
		
		
	}

}
