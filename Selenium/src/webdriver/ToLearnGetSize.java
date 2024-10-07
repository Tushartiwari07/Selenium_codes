package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize 
{
	public static void main(String[] args) 
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.jiocinema.com/");
		Dimension size = c1.manage().window().getSize();//used to get the height and width of the window
		System.out.println(size);//storing it and 
		System.out.println("hight  of the window "+ size.getHeight());
		System.out.println("Widthv  of the window "+ size.getWidth());
		
	}

}
