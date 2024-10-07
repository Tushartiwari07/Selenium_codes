package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillraryBoolean
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Rectangle box = driver.findElement(By.xpath("//input[@class='form-control']")).getRect();
		System.out.println(box.getHeight()+" height of the box");
		System.out.println(box.getWidth()+" width of the box");
		System.out.println(box.getX()+" x position of the box");
		System.out.println(box.getY()+" y position of the box");
		
		WebElement Sub = driver.findElement(By.xpath("//input[@class='form-control']"));
		System.out.println(Sub.isEnabled()+"  Enabled condition");
		System.out.println(Sub.isDisplayed()+" Displayed condition");
	}
}
