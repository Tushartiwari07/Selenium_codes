package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClose_Quit
{

	public static void main(String[] args) 
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.get("https://www.shoppersstack.com/");
		try
		{
			Thread.sleep(20000);//thread is use to wait
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		c1.findElement(By.id("campare")).clear();
		c1.close();//it is use to close Single Window
//		c1.quit();//it is used to close all /multiple windowa
		
	}
}
