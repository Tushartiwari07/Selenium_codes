package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Rectangle rect = driver.findElement(By.xpath("//input[@value='Search']")).getRect();
		System.out.println("Height of the Element "+ rect.getHeight());
		System.out.println("Width of the Element "+ rect.getWidth());
		System.out.println("X co-ordinate of the Element "+ rect.getY());
		System.out.println("y co-ordinate of the Element "+ rect.getY());


	}

}
