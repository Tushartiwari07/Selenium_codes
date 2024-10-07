package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
//		c1.get("https://www.flipkart.com/");
		c1.navigate().to("https://www.flipkart.com/");
		c1.manage().window().setSize(new Dimension(500, 500));
		c1.manage().window().setPosition(new Point(150, 70));
		c1.navigate().back();
		Thread.sleep(2000);
		c1.navigate().forward();
		
	}
}
