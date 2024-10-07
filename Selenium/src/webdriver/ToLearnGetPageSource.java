package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPageSource 
{
	public static void main(String[] args) 
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.get("https://www.primevideo.com/");
		String source = c1.getPageSource();//it is use to get the source code of the web page
		System.out.println(source);
		c1.close();//it is use to close Single Window
		//
		
	}

}
