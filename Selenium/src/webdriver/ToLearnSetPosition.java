package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSetPosition 
{
	public static void main(String[] args) 
	{
		ChromeDriver c1  = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.primevideo.com/collection/IncludedwithPrime");
		c1.manage().window().setPosition(new Point(150, 90));//it is used to set the position of the window
		
	}

}
