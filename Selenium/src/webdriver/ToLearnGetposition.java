package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetposition {

	public static void main(String[] args)
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.jiocinema.com/");
		Point position = c1.manage().window().getPosition();//it is used to get the position of the windows
		System.out.println(position);//Storing it in the variable and printing
		System.out.println("position of  X" + position.getX());
		System.out.println("position of  y" +position.getY());
		c1.close();
	}
}
