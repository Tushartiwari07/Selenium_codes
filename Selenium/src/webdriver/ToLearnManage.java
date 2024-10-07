package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManage 
{
	public static void main(String[] args) 
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();// It is used to maximize the window 
//		c1.manage().window().minimize();// it is used to minimize the window
//		c1.manage().window().fullscreen();//It is use for  fullScren
		c1.get("https://www.youtube.com/");
	
		
		
	}

}
